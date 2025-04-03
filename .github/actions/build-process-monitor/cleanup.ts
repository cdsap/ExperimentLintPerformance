import { exec, execSync } from 'child_process';
import { promisify } from 'util';
import * as fs from 'fs';
import * as path from 'path';
import { DefaultArtifactClient } from '@actions/artifact';
import * as core from '@actions/core';

const execAsync = promisify(exec);

interface ProcessData {
    timestamps: string[];
    rss: number[];
}

function parseLogFile(logFile: string): { processes: Map<string, ProcessData>, timestamps: string[] } {
    const processes = new Map<string, ProcessData>();
    const timestamps = new Set<string>();

    const lines = fs.readFileSync(logFile, 'utf8').split('\n');
    // Skip header lines
    lines.slice(2).forEach(line => {
        const parts = line.trim().split('|');
        if (parts.length !== 6) return;

        const [timestamp, pid, name, heapUsed, heapCap, rss] = parts.map(p => p.trim());
        const rssValue = parseFloat(rss.replace('MB', ''));

        if (!processes.has(name)) {
            processes.set(name, { timestamps: [], rss: [] });
        }

        processes.get(name)!.timestamps.push(timestamp);
        processes.get(name)!.rss.push(rssValue);
        timestamps.add(timestamp);
    });

    return { processes, timestamps: Array.from(timestamps).sort() };
}

function generateMermaidChart(processes: Map<string, ProcessData>, timestamps: string[]): string {
    // Sample points to avoid overcrowding (show ~8 points)
    const interval = Math.ceil(timestamps.length / 8);
    const sampledTimestamps = timestamps.filter((_, i) => i % interval === 0);

    // Calculate ranges for better visualization
    const maxRss = Math.max(...Array.from(processes.values()).flatMap(p => p.rss));
    const minRss = Math.min(...Array.from(processes.values()).flatMap(p => p.rss));
    
    // Start Mermaid chart definition
    let mermaid = `%%{init: {'theme': 'dark', 'themeVariables': { 'fontSize': '14px' }}}%%
flowchart LR
    subgraph Memory["Memory Usage Trend (MB)"]
        direction TB\n`;

    // Add memory scale on the left
    const scaleSteps = 5;
    const scaleStep = (maxRss - minRss) / scaleSteps;
    for (let i = 0; i <= scaleSteps; i++) {
        const value = Math.round(maxRss - (i * scaleStep));
        mermaid += `        scale${i}["${value}MB"]\n`;
    }

    // Add connections between scale points
    for (let i = 0; i < scaleSteps; i++) {
        mermaid += `        scale${i} --- scale${i + 1}\n`;
    }

    // Process each data series
    const colors = ['#ff6b6b', '#4ecdc4', '#45b7d1'];
    Array.from(processes.entries()).forEach(([name, data], processIndex) => {
        const sampledData = sampledTimestamps.map(timestamp => {
            const idx = data.timestamps.indexOf(timestamp);
            return idx !== -1 ? data.rss[idx] : null;
        }).filter(v => v !== null);

        // Add nodes for each data point
        sampledData.forEach((rss, i) => {
            const nodeId = `${name.replace(/[^a-zA-Z0-9]/g, '_')}_${i}`;
            mermaid += `        ${nodeId}["${rss.toFixed(0)}MB"]\n`;
            // Style the node
            mermaid += `        style ${nodeId} fill:${colors[processIndex]},color:white\n`;
        });

        // Connect the nodes
        for (let i = 0; i < sampledData.length - 1; i++) {
            const nodeId1 = `${name.replace(/[^a-zA-Z0-9]/g, '_')}_${i}`;
            const nodeId2 = `${name.replace(/[^a-zA-Z0-9]/g, '_')}_${i + 1}`;
            mermaid += `        ${nodeId1} --> ${nodeId2}\n`;
        }
    });

    mermaid += '    end\n\n';

    // Add legend
    mermaid += '    subgraph Legend\n';
    Array.from(processes.entries()).forEach(([name, data], idx) => {
        const maxRss = Math.max(...data.rss);
        const avgRss = data.rss.reduce((a, b) => a + b, 0) / data.rss.length;
        const nodeId = `legend_${name.replace(/[^a-zA-Z0-9]/g, '_')}`;
        mermaid += `        ${nodeId}["${name}<br/>Max: ${maxRss.toFixed(0)}MB<br/>Avg: ${avgRss.toFixed(0)}MB"]\n`;
        mermaid += `        style ${nodeId} fill:${colors[idx]},color:white\n`;
    });
    mermaid += '    end\n';

    return mermaid;
}

async function run() {
    try {
        // Kill the monitor process if it's still running
        try {
            const pid = fs.readFileSync('monitor.pid', 'utf8').trim();
            process.kill(parseInt(pid));
            console.log(`Killed monitor process with PID ${pid}`);
        } catch (error) {
            console.log('No monitor process found to kill');
        }

        // Parse log file
        console.log('Generating memory usage graph...');
        const { processes, timestamps } = parseLogFile('java_mem_monitor.log');
        
        // Generate Mermaid chart
        const mermaidChart = generateMermaidChart(processes, timestamps);

        // Upload log file as artifact
        const artifactClient = new DefaultArtifactClient();
        const artifactName = 'java-memory-monitor';
        const files = ['java_mem_monitor.log'];
        const rootDirectory = '.';

        console.log('Uploading artifacts...');
        await artifactClient.uploadArtifact(artifactName, files, rootDirectory);
        console.log('Successfully uploaded artifacts');

        // Add to GitHub Actions summary
        if (process.env.GITHUB_STEP_SUMMARY) {
            const summary = fs.readFileSync(process.env.GITHUB_STEP_SUMMARY, 'utf8');

            // Calculate some statistics
            const maxRss = Math.max(...Array.from(processes.values()).flatMap(p => p.rss));
            const processCount = processes.size;
            const duration = timestamps.length > 0 ?
                `from ${timestamps[0]} to ${timestamps[timestamps.length - 1]}` :
                'N/A';

            const newSummary = `${summary}

## Memory Usage Analysis

### Overview
- Number of processes monitored: ${processCount}
- Maximum RSS observed: ${maxRss.toFixed(2)} MB
- Monitoring duration: ${duration}

### Memory Usage Graph
${mermaidChart}

### Process Details
${Array.from(processes.entries()).map(([name, data]) => {
    const maxProcessRss = Math.max(...data.rss);
    const avgProcessRss = data.rss.reduce((a, b) => a + b, 0) / data.rss.length;
    return `#### ${name}
- Maximum RSS: ${maxProcessRss.toFixed(2)} MB
- Average RSS: ${avgProcessRss.toFixed(2)} MB
- Number of measurements: ${data.rss.length}`;
}).join('\n\n')}

> Note: The detailed log file is available in the artifacts of this workflow run.`;

            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, newSummary);
        }
    } catch (error) {
        console.error('Error during cleanup:', error);
        process.exit(1);
    }
}

run();

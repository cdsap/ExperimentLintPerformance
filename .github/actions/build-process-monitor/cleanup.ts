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
    // Calculate time intervals for x-axis (we'll show fewer points for readability)
    const timeInterval = Math.ceil(timestamps.length / 15); // Show ~15 points
    const selectedTimestamps = timestamps.filter((_, i) => i % timeInterval === 0);

    // Start Mermaid chart definition
    let mermaid = `%%{init: {'theme': 'dark'}}%%
xychart-beta
    title "Java Process Memory Usage Over Time"
    x-axis "${selectedTimestamps[0]}" --> "${selectedTimestamps[selectedTimestamps.length - 1]}" [Memory Usage (MB)]
    y-axis "Memory (MB)" 0 --> ${Math.ceil(Math.max(...Array.from(processes.values()).flatMap(p => p.rss)) / 500) * 500}\n`;

    // Add each process as a line
    Array.from(processes.entries()).forEach(([name, data], idx) => {
        // Filter data points to match selected timestamps
        const filteredData = selectedTimestamps.map(timestamp => {
            const index = data.timestamps.indexOf(timestamp);
            return index !== -1 ? data.rss[index] : null;
        }).filter(val => val !== null);

        // Add line data
        mermaid += `    line ${name}\n`;
        selectedTimestamps.forEach((_, i) => {
            if (filteredData[i] !== undefined) {
                mermaid += `        ${i} ${filteredData[i]}\n`;
            }
        });
    });

    // Calculate and add aggregated RSS
    mermaid += `    line Aggregated RSS\n`;
    selectedTimestamps.forEach((timestamp, i) => {
        const total = Array.from(processes.values())
            .reduce((sum, proc) => {
                const idx = proc.timestamps.indexOf(timestamp);
                return sum + (idx !== -1 ? proc.rss[idx] : 0);
            }, 0);
        mermaid += `        ${i} ${total}\n`;
    });

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

        // Parse log file and generate chart
        console.log('Generating memory usage graph...');
        const { processes, timestamps } = parseLogFile('java_mem_monitor.log');
        const mermaidChart = generateMermaidChart(processes, timestamps);
        
        // Save chart for reference (optional)
        fs.writeFileSync('memory_usage.mmd', mermaidChart);

        // Upload artifacts
        const artifactClient = new DefaultArtifactClient();
        const artifactName = 'java-memory-monitor';
        const files = ['java_mem_monitor.log', 'memory_usage.mmd'];
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

\`\`\`mermaid
${mermaidChart}
\`\`\`

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

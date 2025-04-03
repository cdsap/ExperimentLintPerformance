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

function generateSvg(processes: Map<string, ProcessData>, timestamps: string[]): string {
    const width = 1200;
    const height = 800;
    const margin = {
        top: 60,
        right: 200, // Increased for legend
        bottom: 100,
        left: 80
    };

    // Calculate scales
    const maxRss = Math.max(...Array.from(processes.values()).flatMap(p => p.rss));
    const xScale = (width - margin.left - margin.right) / (timestamps.length - 1) || 1;
    const yScale = (height - margin.top - margin.bottom) / maxRss;

    // Colors for different processes
    const colors = ['#FF6B6B', '#4ECDC4', '#45B7D1', '#96CEB4', '#FFEEAD'];

    // Generate SVG content
    let svg = `<svg width="${width}" height="${height}" xmlns="http://www.w3.org/2000/svg">\n`;
    
    // Add title
    svg += `<text x="${width/2}" y="30" text-anchor="middle" font-size="20" font-weight="bold">Java Process Memory Usage Over Time</text>\n`;

    // Add grid lines
    const gridLines = Math.ceil(maxRss / 100);
    for (let i = 0; i <= gridLines; i++) {
        const y = height - margin.bottom - (i * 100 * yScale);
        svg += `<line x1="${margin.left}" y1="${y}" x2="${width - margin.right}" y2="${y}" 
                stroke="#e0e0e0" stroke-width="1" stroke-dasharray="5,5"/>\n`;
    }

    // Draw axes
    svg += `<line x1="${margin.left}" y1="${height - margin.bottom}" x2="${width - margin.right}" y2="${height - margin.bottom}" 
            stroke="black" stroke-width="2"/>\n`;
    svg += `<line x1="${margin.left}" y1="${height - margin.bottom}" x2="${margin.left}" y2="${margin.top}" 
            stroke="black" stroke-width="2"/>\n`;

    // Draw Y axis labels
    for (let i = 0; i <= gridLines; i++) {
        const y = height - margin.bottom - (i * 100 * yScale);
        svg += `<text x="${margin.left - 10}" y="${y + 5}" text-anchor="end" font-size="12">${i * 100}MB</text>\n`;
    }

    // Draw X axis labels (every 10th timestamp to prevent overcrowding)
    const labelInterval = Math.ceil(timestamps.length / 15); // Show ~15 labels
    for (let i = 0; i < timestamps.length; i += labelInterval) {
        const x = margin.left + (i * xScale);
        svg += `<text x="${x}" y="${height - margin.bottom + 20}" 
                transform="rotate(45 ${x},${height - margin.bottom + 20})" 
                text-anchor="start" font-size="10">${timestamps[i]}</text>\n`;
    }

    // Draw process lines with smoothing
    Array.from(processes.entries()).forEach(([name, data], idx) => {
        const points = data.timestamps.map((timestamp, i) => {
            const x = margin.left + (timestamps.indexOf(timestamp) * xScale);
            const y = height - margin.bottom - (data.rss[i] * yScale);
            return `${x},${y}`;
        }).join(' ');

        // Add line with slight opacity
        svg += `<polyline points="${points}" stroke="${colors[idx % colors.length]}" 
                stroke-width="2" fill="none" opacity="0.8"/>\n`;

        // Add legend
        const legendY = margin.top + 25 * (idx + 1);
        svg += `<rect x="${width - margin.right + 10}" y="${legendY - 10}" width="15" height="15" 
                fill="${colors[idx % colors.length]}" opacity="0.8"/>\n`;
        svg += `<text x="${width - margin.right + 35}" y="${legendY + 2}" 
                font-size="12">${name}</text>\n`;
    });

    // Calculate and draw aggregated RSS
    const aggregatedRss = timestamps.map(timestamp => {
        return Array.from(processes.values())
            .filter(p => p.timestamps.includes(timestamp))
            .reduce((sum, p) => sum + p.rss[p.timestamps.indexOf(timestamp)], 0);
    });

    const aggregatedPoints = timestamps.map((timestamp, i) => {
        const x = margin.left + (i * xScale);
        const y = height - margin.bottom - (aggregatedRss[i] * yScale);
        return `${x},${y}`;
    }).join(' ');

    // Draw aggregated line
    svg += `<polyline points="${aggregatedPoints}" stroke="black" stroke-width="2.5" 
            stroke-dasharray="5,5" fill="none" opacity="0.9"/>\n`;

    // Add aggregated to legend
    const legendY = margin.top + 25 * (processes.size + 1);
    svg += `<rect x="${width - margin.right + 10}" y="${legendY - 10}" width="15" height="15" 
            fill="black" opacity="0.9"/>\n`;
    svg += `<text x="${width - margin.right + 35}" y="${legendY + 2}" 
            font-size="12">Aggregated RSS</text>\n`;

    // Add axis labels
    svg += `<text x="${width/2}" y="${height - 10}" text-anchor="middle" font-size="14">Time</text>\n`;
    svg += `<text x="${margin.left - 60}" y="${height/2}" text-anchor="middle" 
            transform="rotate(-90 ${margin.left - 60},${height/2})" font-size="14">Memory Usage (MB)</text>\n`;

    svg += '</svg>';
    return svg;
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

        // Parse log file and generate SVG
        console.log('Generating memory usage graph...');
        const { processes, timestamps } = parseLogFile('java_mem_monitor.log');
        const svgContent = generateSvg(processes, timestamps);
        fs.writeFileSync('memory_usage.svg', svgContent);

        // Upload artifacts first
        const artifactClient = new DefaultArtifactClient();
        const artifactName = 'java-memory-monitor';
        const files = ['java_mem_monitor.log', 'memory_usage.svg'];
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

            // Get the run ID and repository from GitHub environment variables
            const runId = process.env.GITHUB_RUN_ID;
            const repository = process.env.GITHUB_REPOSITORY;
            
            // Construct the artifact URL
            const artifactUrl = `https://github.com/${repository}/actions/runs/${runId}/artifacts`;

            const newSummary = `${summary}

## Memory Usage Analysis

### Overview
- Number of processes monitored: ${processCount}
- Maximum RSS observed: ${maxRss.toFixed(2)} MB
- Monitoring duration: ${duration}

### Memory Usage Graph
![Memory Usage Graph](${artifactUrl})

The memory usage graph is available in the artifacts of this workflow run. You can download it from [here](${artifactUrl}).

### Process Details
${Array.from(processes.entries()).map(([name, data]) => {
    const maxProcessRss = Math.max(...data.rss);
    const avgProcessRss = data.rss.reduce((a, b) => a + b, 0) / data.rss.length;
    return `#### ${name}
- Maximum RSS: ${maxProcessRss.toFixed(2)} MB
- Average RSS: ${avgProcessRss.toFixed(2)} MB
- Number of measurements: ${data.rss.length}`;
}).join('\n\n')}

> Note: The detailed log file is also available in the artifacts of this workflow run.`;

            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, newSummary);
        }
    } catch (error) {
        console.error('Error during cleanup:', error);
        process.exit(1);
    }
}

run();

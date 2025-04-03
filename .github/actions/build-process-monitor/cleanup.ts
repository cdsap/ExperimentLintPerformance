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
    const margin = 50;

    // Calculate scales
    const maxRss = Math.max(...Array.from(processes.values()).flatMap(p => p.rss));
    const xScale = (width - 2 * margin) / (timestamps.length - 1) || 1;
    const yScale = (height - 2 * margin) / maxRss;

    // Colors for different processes
    const colors = ['#FF6B6B', '#4ECDC4', '#45B7D1', '#96CEB4', '#FFEEAD'];

    // Generate SVG content
    let svg = `<svg width="${width}" height="${height}" xmlns="http://www.w3.org/2000/svg">\n`;

    // Draw axes
    svg += `<line x1="${margin}" y1="${height - margin}" x2="${width - margin}" y2="${height - margin}" stroke="black" stroke-width="2"/>\n`;
    svg += `<line x1="${margin}" y1="${height - margin}" x2="${margin}" y2="${margin}" stroke="black" stroke-width="2"/>\n`;

    // Draw Y axis labels
    for (let i = 0; i <= maxRss; i += 100) {
        const y = height - margin - (i * yScale);
        svg += `<text x="${margin - 40}" y="${y + 5}" text-anchor="end">${i}MB</text>\n`;
    }

    // Draw X axis labels (every 5th timestamp)
    for (let i = 0; i < timestamps.length; i += 5) {
        const x = margin + (i * xScale);
        svg += `<text x="${x}" y="${height - margin + 20}" text-anchor="middle">${timestamps[i]}</text>\n`;
    }

    // Draw process lines
    Array.from(processes.entries()).forEach(([name, data], idx) => {
        const points = data.timestamps.map((timestamp, i) => {
            const x = margin + (timestamps.indexOf(timestamp) * xScale);
            const y = height - margin - (data.rss[i] * yScale);
            return `${x},${y}`;
        }).join(' ');

        svg += `<polyline points="${points}" stroke="${colors[idx % colors.length]}" stroke-width="2" fill="none"/>\n`;

        // Add legend
        svg += `<text x="${width - margin + 10}" y="${margin + 20 * (idx + 1)}" fill="${colors[idx % colors.length]}">${name}</text>\n`;
    });

    // Calculate and draw aggregated RSS
    const aggregatedRss = timestamps.map(timestamp => {
        return Array.from(processes.values())
            .filter(p => p.timestamps.includes(timestamp))
            .reduce((sum, p) => sum + p.rss[p.timestamps.indexOf(timestamp)], 0);
    });

    const aggregatedPoints = timestamps.map((timestamp, i) => {
        const x = margin + (i * xScale);
        const y = height - margin - (aggregatedRss[i] * yScale);
        return `${x},${y}`;
    }).join(' ');

    svg += `<polyline points="${aggregatedPoints}" stroke="black" stroke-width="3" stroke-dasharray="5,5" fill="none"/>\n`;

    // Add aggregated to legend
    svg += `<text x="${width - margin + 10}" y="${margin + 20 * (processes.size + 1)}" fill="black">Aggregated RSS</text>\n`;

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
The graph below shows the RSS memory consumption of each Java process over time, along with the aggregated total.

${svgContent}

### Process Details
${Array.from(processes.entries()).map(([name, data]) => {
    const maxProcessRss = Math.max(...data.rss);
    const avgProcessRss = data.rss.reduce((a, b) => a + b, 0) / data.rss.length;
    return `#### ${name}
- Maximum RSS: ${maxProcessRss.toFixed(2)} MB
- Average RSS: ${avgProcessRss.toFixed(2)} MB
- Number of measurements: ${data.rss.length}`;
}).join('\n\n')}

> Note: The graph and detailed log file are also available as artifacts in this workflow run.`;

            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, newSummary);
        }

        // Upload the log file as an artifact
        const artifactClient = new DefaultArtifactClient();
        const artifactName = 'java-memory-monitor';
        const files = ['java_mem_monitor.log', 'memory_usage.svg'];
        const rootDirectory = '.';

        await artifactClient.uploadArtifact(artifactName, files, rootDirectory);
        console.log('Successfully uploaded artifacts');
    } catch (error) {
        console.error('Error during cleanup:', error);
        process.exit(1);
    }
}

run();

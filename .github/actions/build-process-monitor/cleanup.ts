import * as core from '@actions/core';
import * as exec from '@actions/exec';
import * as fs from 'fs';
import * as path from 'path';
import { DefaultArtifactClient, UploadArtifactOptions } from '@actions/artifact';

async function run(): Promise<void> {
    try {
        core.info('Starting Java memory monitor cleanup...');

        // Stop monitor if running
        if (fs.existsSync('monitor.pid')) {
            const pid = parseInt(fs.readFileSync('monitor.pid', 'utf8'), 10);
            core.info(`Found monitor PID: ${pid}`);

            try {
                process.kill(pid, 0);
                core.info('Monitor is still running, stopping it...');
                process.kill(pid);

                // Wait a bit and check if still running
                await new Promise(resolve => setTimeout(resolve, 1000));
                try {
                    process.kill(pid, 0);
                    core.info('Monitor still running, forcing kill...');
                    process.kill(pid, 'SIGKILL');
                } catch (error) {
                    // Process already terminated
                }
            } catch (error) {
                // Process already terminated
            }

            fs.unlinkSync('monitor.pid');
        }

        // Generate summary
        if (process.env.GITHUB_STEP_SUMMARY) {
            let summary = '### Java Memory Monitor Summary\n';

            if (fs.existsSync('java_mem_monitor.log')) {
                const logContent = fs.readFileSync('java_mem_monitor.log', 'utf8');
                const lines = logContent.split('\n');

                // Add last 20 lines
                summary += 'Last 20 lines of memory monitoring:\n```\n';
                summary += lines.slice(-20).join('\n');
                summary += '\n```\n';

                // Track processes and their max RSS
                const processes = new Map<string, { count: number; maxRss: number }>();
                lines.forEach(line => {
                    // Match the process name and RSS value
                    const match = line.match(/\|([^|]+)\s+[^|]+\|([^|]+)\|([^|]+)\|/);
                    if (match) {
                        const process = match[1].trim();
                        const rssStr = match[3].trim();
                        // Extract numeric value from RSS string (e.g., "1234 KB" -> 1234)
                        const rssMatch = rssStr.match(/(\d+)/);
                        if (rssMatch) {
                            const rss = parseInt(rssMatch[1], 10);
                            if (!isNaN(rss)) {
                                const current = processes.get(process) || { count: 0, maxRss: 0 };
                                processes.set(process, {
                                    count: current.count + 1,
                                    maxRss: Math.max(current.maxRss, rss)
                                });
                            }
                        }
                    }
                });

                // Add process summary with max RSS
                summary += '\n### Processes Monitored\n```\n';
                Array.from(processes.entries())
                    .sort((a, b) => b[1].maxRss - a[1].maxRss)
                    .forEach(([process, data]) => {
                        const rssMB = (data.maxRss / 1024).toFixed(2);
                        summary += `${data.count} ${process} (max RSS: ${rssMB}MB)\n`;
                    });
                summary += '```\n';

                // Upload log file as artifact
                try {
                    const artifactClient = new DefaultArtifactClient();
                    const artifactName = 'java-memory-monitor-log';
                    const files = ['java_mem_monitor.log'];
                    const rootDirectory = process.cwd();
                    const options: UploadArtifactOptions = {
                        retentionDays: undefined
                    };

                    const uploadResponse = await artifactClient.uploadArtifact(
                        artifactName,
                        files,
                        rootDirectory,
                        options
                    );

                    summary += `\n### Full Log File\n`;
                    summary += `The complete log file has been uploaded as an artifact named '${artifactName}'\n`;
                    summary += `You can download it from the Actions tab of this workflow run.\n`;
                    if (uploadResponse.size !== undefined) {
                        summary += `Artifact size: ${(uploadResponse.size / 1024).toFixed(2)}KB\n`;
                    }
                } catch (error) {
                    core.warning(`Failed to upload log file as artifact: ${error}`);
                    summary += `\n### Full Log File\n`;
                    summary += `Failed to upload the log file as an artifact.\n`;
                }
            } else {
                summary += 'No monitoring log found\n';
            }

            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, summary);
        } else {
            core.warning('GITHUB_STEP_SUMMARY is not set');
        }

        // Move log file to logs directory
        if (fs.existsSync('java_mem_monitor.log')) {
            const logsDir = 'logs';
            if (!fs.existsSync(logsDir)) {
                fs.mkdirSync(logsDir);
            }
            fs.renameSync('java_mem_monitor.log', path.join(logsDir, 'java_mem_monitor.log'));
        }

        core.info('Java memory monitor cleanup completed successfully');

    } catch (error) {
        core.setFailed(error instanceof Error ? error.message : String(error));
    }
}

run();

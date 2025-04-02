import * as core from '@actions/core';
import * as exec from '@actions/exec';
import * as fs from 'fs';
import * as path from 'path';

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
                
                // Add process summary
                const processes = new Map<string, number>();
                lines.forEach(line => {
                    const match = line.match(/\|([^|]+)\|/);
                    if (match) {
                        const process = match[1].trim();
                        processes.set(process, (processes.get(process) || 0) + 1);
                    }
                });
                
                summary += '\n### Processes Monitored\n```\n';
                Array.from(processes.entries())
                    .sort((a, b) => b[1] - a[1])
                    .forEach(([process, count]) => {
                        summary += `${count} ${process}\n`;
                    });
                summary += '```\n';
            } else {
                summary += 'No monitoring log found\n';
            }
            
            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, summary);
        } else {
            core.warning('GITHUB_STEP_SUMMARY is not set');
        }

        // Move log file
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
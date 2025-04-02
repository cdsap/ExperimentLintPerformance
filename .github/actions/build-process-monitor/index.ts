import * as core from '@actions/core';
import * as exec from '@actions/exec';
import * as fs from 'fs';
import * as path from 'path';
import * as os from 'os';
import { spawn } from 'child_process';

async function run(): Promise<void> {
    try {
        const interval = core.getInput('interval', { required: false }) || '5';
        const monitorScript = path.join(__dirname, 'monitor.sh');
        
        // Make monitor script executable
        await exec.exec('chmod', ['+x', monitorScript]);

        // Start monitor in background using spawn
        const monitor = spawn('nohup', [monitorScript, interval], {
            detached: true,
            stdio: ['ignore', 'pipe', 'pipe']
        });

        // Handle monitor output
        monitor.stdout.on('data', (data) => {
            core.info(`Monitor stdout: ${data}`);
        });

        monitor.stderr.on('data', (data) => {
            core.error(`Monitor stderr: ${data}`);
        });

        // Wait a bit for the monitor to start and write its PID
        await new Promise(resolve => setTimeout(resolve, 2000));

        // Get the PID from the monitor.pid file
        if (!fs.existsSync('monitor.pid')) {
            throw new Error('Monitor failed to create PID file');
        }
        const pid = parseInt(fs.readFileSync('monitor.pid', 'utf8'), 10);
        core.setOutput('monitor_pid', pid);

        // Verify monitor is running
        try {
            process.kill(pid, 0);
            core.info(`Monitor started successfully with PID ${pid}`);
            const { stdout } = await exec.getExecOutput('ps', ['-p', pid.toString(), '-o', 'command']);
            core.info(stdout);
        } catch (error) {
            core.error('Monitor failed to start properly');
            if (fs.existsSync('java_mem_monitor.log')) {
                core.error(fs.readFileSync('java_mem_monitor.log', 'utf8'));
            }
            throw error;
        }

        // Register cleanup handler for process events
        process.on('exit', async (code) => {
            await cleanup();
            process.exit(code);
        });

        process.on('SIGINT', async () => {
            await cleanup();
            process.exit(0);
        });

        process.on('SIGTERM', async () => {
            await cleanup();
            process.exit(0);
        });

        // Register post-execution step
        const postScript = path.join(__dirname, 'post-monitor.sh');
        fs.writeFileSync(postScript, `#!/bin/bash
if [ -f "monitor.pid" ]; then
    pid=$(cat monitor.pid)
    kill $pid 2>/dev/null || true
    rm -f monitor.pid
fi
if [ -f "java_mem_monitor.log" ]; then
    mkdir -p logs
    mv java_mem_monitor.log logs/
fi
`);
        await exec.exec('chmod', ['+x', postScript]);
        core.setOutput('post_script_path', postScript);
        core.setOutput('post_script_executable', 'true');
        core.setOutput('post_script_condition', 'always()');

    } catch (error) {
        core.setFailed(error instanceof Error ? error.message : String(error));
    }
}

async function cleanup(): Promise<void> {
    try {
        core.info('Stopping Java memory monitor...');
        
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

    } catch (error) {
        core.error('Error during cleanup:');
        core.error(error instanceof Error ? error.message : String(error));
    }
}

run(); 
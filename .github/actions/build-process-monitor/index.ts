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
            stdio: 'ignore'
        });

        // Unref the process to allow the parent to exit
        monitor.unref();

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

    } catch (error) {
        core.setFailed(error instanceof Error ? error.message : String(error));
    }
}

run(); 
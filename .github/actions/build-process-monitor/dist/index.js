"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || (function () {
    var ownKeys = function(o) {
        ownKeys = Object.getOwnPropertyNames || function (o) {
            var ar = [];
            for (var k in o) if (Object.prototype.hasOwnProperty.call(o, k)) ar[ar.length] = k;
            return ar;
        };
        return ownKeys(o);
    };
    return function (mod) {
        if (mod && mod.__esModule) return mod;
        var result = {};
        if (mod != null) for (var k = ownKeys(mod), i = 0; i < k.length; i++) if (k[i] !== "default") __createBinding(result, mod, k[i]);
        __setModuleDefault(result, mod);
        return result;
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
const core = __importStar(require("@actions/core"));
const exec = __importStar(require("@actions/exec"));
const fs = __importStar(require("fs"));
const path = __importStar(require("path"));
async function run() {
    try {
        const interval = core.getInput('interval', { required: false }) || '5';
        const monitorScript = path.join(__dirname, 'monitor.sh');
        // Make monitor script executable
        await exec.exec('chmod', ['+x', monitorScript]);
        // Start monitor in background
        const exitCode = await exec.exec('setsid', ['nohup', monitorScript, interval], {
            silent: true
        });
        if (exitCode !== 0) {
            throw new Error(`Failed to start monitor: exit code ${exitCode}`);
        }
        // Get the PID from the monitor.pid file
        await new Promise(resolve => setTimeout(resolve, 2000));
        const pid = parseInt(fs.readFileSync('monitor.pid', 'utf8'), 10);
        core.setOutput('monitor_pid', pid);
        // Verify monitor is running
        try {
            process.kill(pid, 0);
            core.info(`Monitor started successfully with PID ${pid}`);
            const { stdout } = await exec.getExecOutput('ps', ['-p', pid.toString(), '-o', 'command']);
            core.info(stdout);
        }
        catch (error) {
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
    }
    catch (error) {
        core.setFailed(error instanceof Error ? error.message : String(error));
    }
}
async function cleanup() {
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
                }
                catch (error) {
                    // Process already terminated
                }
            }
            catch (error) {
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
                const processes = new Map();
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
            }
            else {
                summary += 'No monitoring log found\n';
            }
            fs.writeFileSync(process.env.GITHUB_STEP_SUMMARY, summary);
        }
        else {
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
    }
    catch (error) {
        core.error('Error during cleanup:');
        core.error(error instanceof Error ? error.message : String(error));
    }
}
run();

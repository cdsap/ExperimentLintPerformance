#!/bin/bash

echo "Stopping Java memory monitor..."

# Kill the monitor process
if [[ -n "$GITHUB_ENV_MONITOR_PID" ]]; then
  kill "$GITHUB_ENV_MONITOR_PID" || true
fi

# Summarize
echo "### Java Memory Monitor Summary" >> $GITHUB_STEP_SUMMARY
tail -n 20 java_mem_monitor.log >> $GITHUB_STEP_SUMMARY

# Upload as artifact
mkdir -p logs
mv java_mem_monitor.log logs/

# Use the GitHub CLI to upload, or delegate to upload-artifact
gh api \
  --method POST \
  -H "Accept: application/vnd.github+json" \
  -H "Authorization: Bearer $ACTIONS_RUNTIME_TOKEN" \
  /repos/$GITHUB_REPOSITORY/actions/artifacts \
  -F name='java-memory-monitor-log' \
  -F file=@logs/java_mem_monitor.log || echo "Upload skipped (fallback needed)"


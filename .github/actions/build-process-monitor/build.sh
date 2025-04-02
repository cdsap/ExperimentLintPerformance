#!/bin/bash

set -x  # Enable command tracing

# Clean and create dist directory
rm -rf dist
mkdir -p dist

# Build index.ts
echo "Building index.ts..."
npx ncc build index.ts -o dist

# Build cleanup.ts
echo "Building cleanup.ts..."
npx ncc build cleanup.ts -o dist-cleanup
mv dist-cleanup/index.js dist/cleanup.js
rm -rf dist-cleanup

# Copy and make monitor script executable
cp monitor.sh dist/
chmod +x dist/monitor.sh

# Final verification
echo "Final contents of dist directory:"
ls -la dist/

# Verify file contents exist
if [ ! -f "dist/index.js" ]; then
    echo "ERROR: dist/index.js is missing!"
    exit 1
fi

if [ ! -f "dist/cleanup.js" ]; then
    echo "ERROR: dist/cleanup.js is missing!"
    exit 1
fi 
#!/bin/bash

# Clean and create dist directory
rm -rf dist
mkdir -p dist

# Build index.ts
echo "Building index.ts..."
npx ncc build index.ts -o dist
mv dist/index.js dist/main.js.tmp

# Build cleanup.ts
echo "Building cleanup.ts..."
npx ncc build cleanup.ts -o dist
mv dist/index.js dist/cleanup.js

# Move index back
mv dist/main.js.tmp dist/index.js

# Copy and make monitor script executable
cp monitor.sh dist/
chmod +x dist/monitor.sh

# List contents for verification
echo "Contents of dist directory:"
ls -la dist/ 
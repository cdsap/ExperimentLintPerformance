#!/bin/bash

# Clean and create dist directory
rm -rf dist
mkdir -p dist

# Build index.ts
npx ncc build index.ts
mv dist/index.js dist/index.js.tmp

# Build cleanup.ts
npx ncc build cleanup.ts
mv dist/index.js dist/cleanup.js

# Move index back
mv dist/index.js.tmp dist/index.js

# Copy and make monitor script executable
cp monitor.sh dist/
chmod +x dist/monitor.sh 
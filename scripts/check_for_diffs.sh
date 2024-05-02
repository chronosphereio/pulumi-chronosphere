#!/usr/bin/env bash

echo "--- :golang: go mod tidy"
(cd provider && go mod tidy)

echo "--- :git: Testing generate code is up to date"
# Enable debugging to see commands executed, if needed
# set -x

# Check if there are any changes or untracked files
if [ -n "$(git status --porcelain)" ]; then
    echo "^^^ +++"
    git status --porcelain
    git diff
    echo "Check git status + diff above, there are changed or untracked files"
    exit 1
fi

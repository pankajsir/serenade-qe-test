#!/bin/bash
set -euox # https://explainshell.com/explain?cmd=set+-euox

docker-compose -f ./perf-test/docker-compose.yml up --abort-on-container-exit

# store results folder name

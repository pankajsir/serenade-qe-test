# ips-server-perf-test

This Repository contains the Dockerfiles and scala scripts to build a Docker image that run Gatling simulations to run load tests. 

## Intent

The solution demonstrates best patterns and practices for performance testing of standered software products.  

## Running the Performance Tests

A new performance test can be triggered either through pipeline, Github or locally from a developer machine

``` Make perfTest ```

## Result

Result can be found under folder -> perf-test > result

## Gatling Test Scripts

gatling test scripts for the project can be found under the project perf-test folder. These use the Gatling performance test tool (https://gatling.io/) and are written in the Scala language. 

## Gatling Resources

To learn more about Gatling: https://gatling.io/docs/current/
The following page is a useful cheat sheet to refer to around the DSL: https://gatling.io/docs/current/cheat-sheet/
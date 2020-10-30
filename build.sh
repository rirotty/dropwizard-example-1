#!/bin/bash
set -e

docker run -it --rm --name dropwizard-example-build \
-v "$(pwd)":/usr/src/dropwizard-example-build \
-w /usr/src/dropwizard-example-build maven:3.6-jdk-11 \
mvn clean package
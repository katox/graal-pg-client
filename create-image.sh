#!/bin/sh

mvn clean package

# Building the image requires at least GraalVM Version 1.0.0-rc8-SNAPSHOT

native-image --enable-all-security-services --report-unsupported-elements-at-runtime -jar /home/katox/dev/graal-pg-client/target/graal-pg-client-1.0-SNAPSHOT.jar

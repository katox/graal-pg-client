#!/bin/sh

mvn clean package
native-image --report-unsupported-elements-at-runtime -cp target/dependency/postgresql-42.2.5.jre7.jar:target/dependency/waffle-jna-1.8.1.jar:target/dependency/guava-19.0.jar:target/dependency/jcl-over-slf4j-1.7.14.jar:target/dependency/jna-4.2.1.jar:target/dependency/jna-platform-4.2.1.jar:target/dependency/slf4j-api-1.7.14.jar:target/dependency/waffle-jna-1.8.1.jar  -jar target/graal-pg-client-1.0-SNAPSHOT.jar

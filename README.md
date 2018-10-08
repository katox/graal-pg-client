# lumgraal/graal-pg-client

Generated using Maven archetype.

## Prerequisites

You will need [Maven][1] 3.0 or above installed.

[1]: https://maven.apache.org

SVM jar from Graal needs to be repackaged as a maven dependency:

    mvn install:install-file -DgroupId=com.oracle -DartifactId=graal-svm \
                                         -Dversion=1.0.0-rc7 -Dpackaging=jar -Dfile=graalvm-ce-1.0.0-rc7/jre/lib/svm/builder/svm.jar

## Build

    mvn clean package

## Run

    java -jar target/graal-pg-client-1.0-SNAPSHOT.jar

### Expected output

    Column 1 returned 1
    The End.
    

## native-image compilation    

    native-image --report-unsupported-elements-at-runtime  -jar target/graal-pg-client-1.0-SNAPSHOT.jar

## License

Copyright © 2018 FIXME

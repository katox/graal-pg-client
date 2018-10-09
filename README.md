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

    java -jar target/graal-pg-client-1.0-SNAPSHOT.jar 2>&1 | grep INFO

    2018-10-09T15:28:55 INFO java.util.logging.LogManager$RootLogger log org.posgresql.Driver.isRegistered() == true
    2018-10-09T15:28:55 INFO java.util.logging.LogManager$RootLogger log Column 1 returned: 1
    2018-10-09T15:28:55 INFO java.util.logging.LogManager$RootLogger log The End.

## native-image compilation    

    ./create-image.sh

## License

Copyright © 2018 FIXME

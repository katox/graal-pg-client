# lumgraal/graal-pg-client

Generated using Maven archetype.

## Prerequisites

You will need [Maven][1] 3.0 or above installed.

Build and create [HikarCP-graal][2] connection pool and install it to your local maven repository

	git clone https://github.com/leafclick/HikariCP
	git checkout graal
	mvn clean install

[1]: https://maven.apache.org
[2]: https://github.com/leafclick/HikariCP

## Build

    mvn clean package

## Run

    java -jar target/graal-pg-client-1.0-SNAPSHOT.jar

### Expected output

    java -jar target/graal-pg-client-1.0-SNAPSHOT.jar 2>&1 | grep INFO

    [main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
    [main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
    2018-10-13T18:09:43 INFO java.util.logging.LogManager$RootLogger log Column 1 returned: 1
    [main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Shutdown initiated...
    [main] INFO com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Shutdown completed.
    2018-10-13T18:09:43 INFO java.util.logging.LogManager$RootLogger log The End.

## native-image compilation    

    ./create-image.sh

## License

Copyright © 2018,2019 Kamil Toman

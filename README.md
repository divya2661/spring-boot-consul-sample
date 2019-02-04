# spring-boot-consul-sample

This repository contains the basic setup required for service discovery in spring-boot application

Check build.gradle file for the dependencies for consul discovery

also in order to make it work for, you need to install consul

#Dev setup

To install consul follow this: https://www.consul.io/docs/install/index.html


-- change host and port in application.yml file in src/main/resources

#Build & Run

```$ ./gradlew clean build```

```$ java -jar build/lib/jepsen-test-0.0.1-SNAPSHOT.jar```

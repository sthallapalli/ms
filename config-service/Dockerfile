FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/config-service-0.0.1-SNAPSHOT.jar /usr/src/config-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/src/config-service-0.0.1-SNAPSHOT.jar"]

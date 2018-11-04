FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/edge-service-0.0.1-SNAPSHOT.jar /usr/src/edge-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/src/edge-service-0.0.1-SNAPSHOT.jar"]

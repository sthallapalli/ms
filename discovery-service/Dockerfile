FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/discovery-service-0.0.1-SNAPSHOT.jar /usr/src/discovery-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/src/discovery-service-0.0.1-SNAPSHOT.jar"]

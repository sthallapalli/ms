FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/department-service-0.0.1-SNAPSHOT.jar /usr/src/department-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/src/department-service-0.0.1-SNAPSHOT.jar"]

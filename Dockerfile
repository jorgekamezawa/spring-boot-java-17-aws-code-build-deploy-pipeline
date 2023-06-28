#FROM eclipse-temurin:17-jdk-alpine
FROM 820070376798.dkr.ecr.us-west-2.amazonaws.com/17-jdk-alpine:latest
VOLUME /tmp
COPY "build/libs/*0.0.1-SNAPSHOT.jar" app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
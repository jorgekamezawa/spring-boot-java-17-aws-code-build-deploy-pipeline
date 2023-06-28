FROM eclipse-temurin:17-jdk-alpine
#FROM $AWS_ACCOUNT_ID.dkr.ecr.$AWS_DEFAULT_REGION.amazonaws.com/eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY "build/libs/*0.0.1-SNAPSHOT.jar" app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
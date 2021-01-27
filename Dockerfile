FROM maven:3.6.3-jdk-11-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -B -f pom.xml clean package -DskipTests

FROM openjdk:11-jdk-slim
COPY --from=build /workspace/target/*.jar /workspace/target/
COPY target/dropwizard-example-1.0-SNAPSHOT.jar dropwizard-example-1.0-SNAPSHOT.jar
COPY config.yml config.yml
EXPOSE 8080
ENTRYPOINT ["java","-jar","dropwizard-example-1.0-SNAPSHOT.jar","server","config.yml"]
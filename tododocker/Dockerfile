FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY target/*.jar app2.jar
ENTRYPOINT ["java","-jar","/app2.jar"]
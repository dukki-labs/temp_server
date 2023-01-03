FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
LABEL org.opencontainers.image.source="https://github.com/phantom08266/spring-boot-flyio"

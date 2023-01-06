FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

LABEL org.opencontainers.image.source=https://github.com/phantom08266/dukki-labs/tech_research
LABEL org.opencontainers.image.description="My container image"

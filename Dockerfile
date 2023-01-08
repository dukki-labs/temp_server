FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar

ARG DB_PW
ENV DATABASE_PASSWORD=${DB_PW}

ARG DB_URL
ENV DATABASE_URL=${DB_URL}

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

LABEL org.opencontainers.image.source=https://github.com/phantom08266/dukki-labs/tech_research
LABEL org.opencontainers.image.description="My container image"

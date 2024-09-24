FROM openjdk:21-jdk-slim-buster
WORKDIR /app
COPY /dist/test-timer-for-docker-app.jar /app/timerapp.jar
ENTRYPOINT ["java", "-jar", "timerapp.jar"]
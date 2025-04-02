FROM openjdk:23-bookworm

WORKDIR /app

RUN apt-get update && apt-get install -y docker.io

RUN apt-get update && apt-get install -y maven

COPY /target/WebViewForRobots-1.0-SNAPSHOT.jar /app/WebViewForRobots-1.0-SNAPSHOT.jar

EXPOSE 8080

RUN apt-get update

CMD ["java", "-jar", "/app/WebViewForRobots-1.0-SNAPSHOT.jar"]

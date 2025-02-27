FROM openjdk:23-bookworm

WORKDIR /app

COPY /target/WebViewForRobots-1.0-SNAPSHOT.jar /app/WebViewForRobots-1.0-SNAPSHOT.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/WebViewForRobots-1.0-SNAPSHOT.jar"]

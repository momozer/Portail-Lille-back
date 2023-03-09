FROM openjdk:21-slim-buster
WORKDIR /app
ADD ./target/PortailLille-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
FROM openjdk:21-slim-buster
#ENV APP_HOME=/usr/app/
WORKDIR /app
ADD ./target/portailLille-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
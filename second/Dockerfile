FROM openjdk:10-jre-slim
COPY ./target/Dockerize-0.0.1-SNAPSHOT.jar /usr/src/hola/
WORKDIR /usr/src/hola
EXPOSE 8080
CMD ["java", "-jar", "Dockerize-0.0.1-SNAPSHOT.jar"]
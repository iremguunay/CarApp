FROM openjdk:11
COPY target/CarApp-0.0.1-SNAPSHOT.jar carapp.jar
CMD ["java", "-jar", "carapp.jar"]
EXPOSE 8081
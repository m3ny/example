FROM amazoncorretto:11
WORKDIR /app
COPY /app/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

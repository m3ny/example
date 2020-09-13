FROM amazoncorretto:11
COPY /app/target/app.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

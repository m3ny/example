FROM amazoncorretto:11
COPY --from=build-env /app/target/app.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

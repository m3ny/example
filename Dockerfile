FROM amazoncorretto:11
run pwd
COPY --from=build /*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

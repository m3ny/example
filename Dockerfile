FROM maven:3.6-jdk-11-slim as build
WORKDIR /home/java
COPY . .
RUN mvn clean package -Dmaven.test.skip=true

FROM amazoncorretto:11
run ls -ltr /home/java
COPY --from=build /home/java/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

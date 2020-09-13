FROM amazoncorretto:11
WORKDIR /home/java
COPY /home/java/target/*.jar ./app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

FROM amazoncorretto:11

RUN pwd
RUN echo "*******"
RUN ls -ltr
COPY ./target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

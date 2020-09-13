FROM amazoncorretto:11

RUN pwd
RUN echo "*******"
RUN ls -ltr /kaniko/executor
RUN ls -ltr /workspace/docker-source
COPY ./target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

FROM amazoncorretto:11

RUN cd /
RUN mkdir myDir
RUN echo "I am here!!!" > /myDir/shouldBeCopied.txt
COPY ./target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:8-jdk-alpine
RUN mkdir -p /opt/app
WORKDIR /opt/app
COPY target/matrix-operation-0.0.1.jar  /opt/app/target/
EXPOSE 9091
CMD ["sh", "-c", "java -jar /opt/app/target/matrix-operation-0.0.1.jar"]
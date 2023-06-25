FROM openjdk:17-jdk-alpine
VOLUME /tmp
ADD target/simple-service-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
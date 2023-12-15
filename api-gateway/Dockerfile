FROM openjdk:17
EXPOSE 8087
ADD target/apiGateway.jar apiGateway.jar
ENTRYPOINT ["java", "-jar", "apiGateway.jar"]
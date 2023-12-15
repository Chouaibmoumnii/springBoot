FROM openjdk:8
EXPOSE 8089
ADD target/userService.jar userS.jar
ENTRYPOINT ["java", "-jar", "userS.jar"]
FROM openjdk:17
EXPOSE 8080
ADD target/github-action-image.jar github-action-image.jar
ENTRYPOINT["java", "-jar", "/github-action-image.jar"]
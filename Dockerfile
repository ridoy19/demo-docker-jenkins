FROM openjdk:11
EXPOSE 9301
ADD target/demo-docker-jenkins.jar demo-docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "demo-docker-jenkins.jar"]
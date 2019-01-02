FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD eureka-client-0.0.1-SNAPSHOT.jar eureka-client.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-client.jar"]
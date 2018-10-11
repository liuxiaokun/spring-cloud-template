FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENV profile=$profile
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=$profile","-jar","/eureka-server.jar]
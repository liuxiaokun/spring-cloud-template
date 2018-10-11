FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
ENV profile=$profile
ENV JAVA_OPTS=$JAVA_OPTS
ENTRYPOINT ["java","$JAVA_OPTS -Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar --spring.active.profile=$profile"]
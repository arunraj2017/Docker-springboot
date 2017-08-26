FROM openjdk:8-jdk-alpine
MAINTAINER arun_raj@live.com
VOLUME /temp
ADD target/SpringBootDocker-0.0.1-SNAPSHOT.jar firstapp.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /firstapp.jar"]
EXPOSE 8080
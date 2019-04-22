FROM openjdk:8-jdk-alpine
#FROM java
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /dkmouse.jar
#RUN bash -c 'touch /dkmouse.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dkmouse.jar"," -Xms512m","-Xmx512m","--spring.profiles.active=prd","--server.port=8001"]
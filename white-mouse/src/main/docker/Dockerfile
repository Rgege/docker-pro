FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /dkmouse.jar
RUN bash -c 'touch /dkmouse.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dkmouse.jar"," -Xms512m","-Xmx512m","--spring.profiles.active=prd","--server.port=8001"]



#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} dkmouse.jar
#EXPOSE 8001
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dkmouse.jar"," -Xms512m","-Xmx512m","--spring.profiles.active=prd","--server.port=8001"]
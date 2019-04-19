FROM java:8
VOLUME /tmp
ARG JAR_FILE
ADD dkmouse.jar dkmouse.jar
RUN bash -c 'touch /dkmouse.jar'
EXPOSE 8001
#ENTRYPOINT ["java","-Djava.security.egd=file:/prd/./urandom","-jar","-Denv=prd","/dkmouse.jar"]
ENTRYPOINT ["java","-jar","/dkmouse.jar"," -Xms512m","-Xmx512m","--spring.profiles.active=prd","--server.port=8001"]
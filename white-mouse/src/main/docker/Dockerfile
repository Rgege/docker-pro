FROM java:8
VOLUME /tmp
ARG JAR_FILE
ADD docker_mouse.jar docker_mouse.jar
RUN bash -c 'touch /docker_mouse.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/prd/./urandom","-jar","-Denv=prd","/docker_mouse.jar"]

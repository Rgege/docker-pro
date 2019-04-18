FROM java:8
VOLUME /tmp
ARG JAR_FILE
ADD dockerMouse.jar dockerMouse.jar
RUN bash -c 'touch /dockerMouse.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/prd/./urandom","-jar","-Denv=prd","/dockerMouse.jar"]

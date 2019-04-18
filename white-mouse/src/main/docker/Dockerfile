FROM java:8
VOLUME /tmp
ARG JAR_FILE
ADD dockerMouse.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Denv=DEV","/app.jar"]

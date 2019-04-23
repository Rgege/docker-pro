FROM openjdk:8-jdk-alpine
#FROM java
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /dkmouse.jar
#RUN bash -c 'touch /dkmouse.jar'
EXPOSE 8001
#ENV JAVA_OPTS="\
#-Xms512m \
#-Xmx512m \
#-Djava.rmi.server.hostname=211.149.142.55 \
#-Dcom.sun.management.jmxremote \
#-Dcom.sun.management.jmxremote.rmi.port=11199 \
#-Dcom.sun.management.jmxremote.port=1199 \
#-Dcom.sun.management.jmxremote.authenticate=false \
#-Dcom.sun.management.jmxremote.ssl=false"

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dkmouse.jar","--spring.profiles.active=prd","--server.port=8001"]
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/dkmouse.jar"," -Xms512m","-Xmx512m","-Dcom.sun.management.jmxremote.port=8999","-Dcom.sun.management.jmxremote.ssl=false","-Dcom.sun.management.jmxremote.authenticate=false","-Djava.rmi.server.hostname=211.149.142.55","--spring.profiles.active=prd","--server.port=8001"]
#ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /dkmouse.jar --spring.profiles.active=prd --server.port=8001

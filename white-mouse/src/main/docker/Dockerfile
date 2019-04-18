#基于openjdk:8
FROM openjdk:8
 
# 指定当前操作目录
WORKDIR /work/project
 
#容器启动后执行的操作
CMD java -jar docker-test.jar

FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD simons-cloud-eureka.jar simons-cloud-eureka.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/simons-cloud-eureka.jar"]

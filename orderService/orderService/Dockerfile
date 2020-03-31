FROM openjdk:12-alpine
MAINTAINER parushasingla
WORKDIR /opt/jars
COPY /target/orderService-*.jar /orderService.jar
CMD ["java","-jar","/orderService.jar"]
EXPOSE 8080
FROM openjdk:12-alpine
MAINTAINER parushasingla
WORKDIR /opt/jars
COPY /target/aggregatorService-*.jar /aggregatorService.jar
CMD ["java","-jar","/aggregatorService.jar"]
EXPOSE 8080
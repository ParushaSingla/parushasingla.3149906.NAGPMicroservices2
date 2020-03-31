FROM openjdk:12-alpine
MAINTAINER parushasingla
WORKDIR /opt/jars
COPY /target/userDetailsService-*.jar /userDetailsService.jar
CMD ["java","-jar","/userDetailsService.jar"]
EXPOSE 8090
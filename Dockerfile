FROM openjdk:11-jdk-alpine
MAINTAINER RcLack
VOLUME /tmp
ADD target/test.jar test.jar
EXPOSE 5000
ENTRYPOINT ["JAVA", "-jar","test.jar"]
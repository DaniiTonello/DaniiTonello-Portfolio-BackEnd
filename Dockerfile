FROM amazoncorretto:11-alpine-jdk
MAINTAINER Daniela-Tonello
COPY target/Daniela-Tonello-0.0.1-SNAPSHOT.jar portfolioDT-app.jar
ENTRYPOINT ["java","-jar",","/portfolioDT-app.jar"]

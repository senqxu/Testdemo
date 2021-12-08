# the first stage of our build will extract the layers
FROM adoptopenjdk/openjdk11:alpine as builder
WORKDIR Testdemo
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract
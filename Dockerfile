FROM openjdk:18-jdk-alpine3.13

LABEL org.opencontainers.image.authors="diego.pereira@harness.io"
LABEL maintainer="Diego Pereira"
LABEL company="Harness"

USER root
RUN   apk update \
  &&   apk add ca-certificates wget \
  &&   update-ca-certificates

#RUN wget -O dd-java-agent.jar "https://dtdg.co/latest-java-tracer" #Datadog
RUN addgroup -S spring && adduser -S spring -G spring
#RUN chown spring:spring dd-java-agent.jar #Datadog
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

#ENTRYPOINT ["java","-javaagent:/dd-java-agent.jar","-jar","/app.jar"] #Datadog
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080/tcp
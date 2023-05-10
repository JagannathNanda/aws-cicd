FROM openjdk:8-jdk-alpine
WORKDIR /tmp
EXPOSE 8886
ARG JAR_FILE
ADD ${JAR_FILE} ./web.jar
#ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java -jar web.jar" ]
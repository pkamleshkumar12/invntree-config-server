FROM openjdk:23
LABEL authors="kamlesh"
VOLUME /tmp
COPY /target/config-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
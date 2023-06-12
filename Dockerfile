FROM openjdk:19
COPY target/terminal-service-1.0-SNAPSHOT.jar terminal-service-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","terminal-service-1.0-SNAPSHOT.jar"]
#EXPOSE 8080

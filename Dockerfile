FROM    openjdk:17-alpine
WORKDIR /discovery_server
COPY target/discovery_server.jar .
CMD ["java","-jar","j.jar"]
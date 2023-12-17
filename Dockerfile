FROM    openjdk:17-alpine
WORKDIR /discovery_server
COPY target/j.jar .
CMD ["java","-jar","j.jar"]
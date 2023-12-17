FROM    openjdk:17-alpine
WORKDIR /j
COPY target/j.jar .
CMD ["java","-jar","j.jar"]
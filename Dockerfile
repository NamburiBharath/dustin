FROM openjdk:8
EXPOSE 8080
ADD target/dustin.jar dustin.jar
ENTRYPOINT ["java","-jar","/dustin.jar"]
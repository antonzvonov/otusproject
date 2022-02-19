FROM openjdk:8
EXPOSE 8080
ADD target/otusproject-1.0-SNAPSHOT.jar otusproject-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/otusproject-1.0-SNAPSHOT.jar"]
FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./build/libs/string-calculator-starter-1.0-SNAssPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "string-calculator-starter-1.0-SNAPSHOT.jar"]

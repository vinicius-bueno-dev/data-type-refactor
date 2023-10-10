
FROM maven:3.8.3-openjdk-17 as build
WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src /app/src

RUN mvn clean package

FROM openjdk:17-jdk-alpine

EXPOSE 8080

COPY --from=build /app/target/java-refactor-leroy-1.0-SNAPSHOT.jar /java-refactor-leroy.jar

ENTRYPOINT ["java","-jar","/java-refactor-leroy.jar"]

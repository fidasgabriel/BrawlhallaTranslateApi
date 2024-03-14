# Stage de compilação
FROM maven:3.8.3-openjdk-17 AS BUILD

COPY . .
RUN mvn clean package -DskipTests

# Stage de pacote
FROM openjdk:17-jdk-slim

COPY --from=BUILD /target/BrawlhallaTranslate-0.0.1-SNAPSHOT.jar brawlhalla.jar

EXPOSE 8085
ENTRYPOINT ["java", "-jar", "brawlhalla.jar"]
FROM eclipse-temurin:17
WORKDIR /home
COPY ./flowers ./flowers
COPY ./target/C322-final-backend-0.0.1-SNAPSHOT.jar C322-final-backend.jar
ENTRYPOINT ["java", "-jar", "C322-final-backend.jar"]
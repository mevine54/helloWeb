FROM openjdk:21

EXPOSE 9000

WORKDIR /app

COPY target/HelloWeb-0.0.1-SNAPSHOT.jar /app/HelloWeb-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "HelloWeb-0.0.1-SNAPSHOT.jar"]
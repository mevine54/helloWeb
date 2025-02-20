FROM openjdk:21

EXPOSE 9000

WORKDIR /app

COPY target/helloweb-0.0.1-SNAPSHOT.jar /app/helloweb-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "helloweb-0.0.1-SNAPSHOT.jar"]
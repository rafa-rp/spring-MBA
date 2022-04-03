FROM openjdk:14
ARG JAR_FILE=build/libs/cademeudono-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
COPY wait-for-it.sh wait-for-it.sh
ENTRYPOINT ["./wait-for-it.sh", "db:3306", "--", "java", "-jar", "app.jar"]
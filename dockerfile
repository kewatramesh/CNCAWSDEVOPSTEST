<<<<<<< HEAD
FROM amazoncorretto:11

ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
=======
FROM amazoncorretto:11

ARG JAR_FILE=build/libs/*SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
>>>>>>> 1c6a49a (TESTCNCAWSDEVOPS)
ENTRYPOINT ["java","-jar","/app.jar"]
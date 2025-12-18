FROM eclipse-temurin:21
WORKDIR /app
COPY target/*.jar myapp.jar
EXPOSE 8080
VOLUME /tmp
ENTRYPOINT ["java","-jar", "/app/myapp.jar"]
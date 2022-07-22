FROM maven:3.8.5 AS maven
WORKDIR /app
COPY . /app
RUN mvn clean package

FROM openjdk:17
ARG JAR_FILE=spring-cloud-config-server.jar
WORKDIR /opt/app
COPY --from=maven app/target/${JAR_FILE} /opt/app/
ENTRYPOINT ["java","-jar","spring-cloud-config-server.jar"]

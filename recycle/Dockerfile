FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/recycle-0.0.1-SNAPSHOT.war

WORKDIR /opt/app

COPY ${JAR_FILE} app.war

ENTRYPOINT [ "java", "-jar", "app.war" ]

EXPOSE 8080
FROM openjdk:14-alpine
COPY target/alicefeeder-*.jar alicefeeder.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "alicefeeder.jar"]
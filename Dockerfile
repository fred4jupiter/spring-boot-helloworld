# DOCKER-VERSION 1.2.0

FROM dockerfile/java

MAINTAINER Michael Staehler <hamsterhase@gmx.de>
 
# Assumes your-app.jar is in the same dir as Dockerfile when you do a `docker build .`
ADD target/spring-boot-helloworld.jar /src/
 
# Also assumes your app exposes port 8080
EXPOSE 8080
 
# Run it!
CMD ["java", "-jar", "/src/spring-boot-helloworld.jar"]

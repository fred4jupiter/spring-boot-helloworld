# DOCKER-VERSION 0.9.1

FROM dockerfile/java

MAINTAINER hamsterhase@gmx.de
 
# Assumes your-app.jar is in the same dir as Dockerfile when you do a `docker build .`
ADD target/spring-boot-helloworld-1.0.0.jar /src/
 
# Also assumes your app exposes port 8080
EXPOSE 8080
 
# Run it!
CMD ["java", "-jar", "/src/spring-boot-helloworld-1.0.0.jar"]

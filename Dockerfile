# Use an official OpenJDK runtime as a parent image
FROM maven:3.8.3-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY out/artifacts/webscraping_jar/webscraping.jar /app/

# Specify the command to run your application
CMD ["java", "-jar", "webscraping.jar"]

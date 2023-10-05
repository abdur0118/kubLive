# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY kub-0.0.1-SNAPSHOT.jar /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "kub-0.0.1-SNAPSHOT.jar"]
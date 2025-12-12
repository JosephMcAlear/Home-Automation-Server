# Use an official OpenJDK image as a base
FROM openjdk:21-ea-jdk-slim

# Install git and any dependencies
RUN apt-get update && apt-get install -y git curl && rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Clone the repository
RUN git clone https://github.com/JosephMcAlear/Home-Automation-Server.git .

# Make gradlew executable
RUN chmod +x ./gradlew

# Build the project (optional, can be done at runtime if you want)
RUN ./gradlew build --no-daemon

# Expose port 8080 (adjust if your app uses another)
EXPOSE 8080

# Run the Spring Boot app
CMD ["java","-jar","./build/libs/server-0.0.1-SNAPSHOT.jar"]
#RUN java -jar ./build/libs/server-0.0.1-SNAPSHOT.jar
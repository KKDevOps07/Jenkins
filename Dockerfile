FROM openjdk:17-jdk-alpine

# Copy your Eureka server JAR into the image
COPY ATS-Server/target/eureka-server.jar /app/eureka-server.jar

# Set environment variables if required
ENV EUREKA_SERVER_PORT=8761

# Expose the default Eureka server port
EXPOSE 8761

# Command to run the Eureka server
CMD ["java", "-jar", "/app/eureka-server.jar"]

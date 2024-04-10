# Base image for your API (replace with your actual base image)
FROM golang:alpine AS builder

# Set working directory
WORKDIR /app

# Copy your Go source code
COPY . .

# Install dependencies
RUN go mod download

# Switch to a lightweight runtime image
FROM alpine:latest

# Expose the port for your API
EXPOSE 8080

# Command to run the application
CMD ["go run main.go"]

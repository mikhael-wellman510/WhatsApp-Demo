# Step 1: Pilih base image untuk Java runtime
FROM openjdk:17-jdk-alpine

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy file .jar ke dalam image
COPY target/MessengersProjectExample-0.0.1-SNAPSHOT.jar /app/MessengersProjectExample-0.0.1-SNAPSHOT.jar

# Step 4: Set environment variables (opsional)
# ENV JAVA_OPTS="-Xms512m -Xmx1024m"

# Step 5: Jalankan aplikasi
ENTRYPOINT ["java", "-jar", "/app/MessengersProjectExample-0.0.1-SNAPSHOT.jar"]
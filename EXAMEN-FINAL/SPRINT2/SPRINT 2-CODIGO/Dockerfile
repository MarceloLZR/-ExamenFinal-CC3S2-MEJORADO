# Usar la imagen base de OpenJDK
FROM openjdk:21

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el contenido del proyecto al directorio de trabajo en el contenedor
COPY . .

# Dar permisos de ejecución al script de Gradle y compilar el proyecto
RUN chmod +x ./gradlew && ./gradlew build

# Comando para ejecutar la clase principal
CMD ["java", "-cp", "build/classes/java/main", "org.example.Main"]

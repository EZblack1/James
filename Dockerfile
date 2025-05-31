FROM eclipse-temurin:11-jre-jammy 
 
# Use a imagem base do OpenJDK 11
 
WORKDIR /app
 
# Define o diretório de trabalho dentro do container
 
COPY target/james-0.0.1-SNAPSHOT.jar myapp.jar
 
# Copia o arquivo JAR da aplicação para o diretório de trabalho
 
EXPOSE 5000   
 
# Expõe a porta 8080 para acesso externo
 
CMD ["java", "-jar", "myapp.jar"]
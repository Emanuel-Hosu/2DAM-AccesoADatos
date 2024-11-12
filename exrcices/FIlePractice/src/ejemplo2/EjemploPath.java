package ejemplo2;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EjemploPath {
    public static void main(String[] args) {
    Path rutaArchivo = Path.of("example.txt");

    try {
            // Crear el archivo si no existe
            if (Files.notExists(rutaArchivo)) {
                Files.createFile(rutaArchivo);
                System.out.println("Archivo creado: " + rutaArchivo.getFileName());
            } else {
                System.out.println("El archivo ya existe.");
            }
            
            // Escribir en el archivo
        String contenido = "Hola 1 \n" + "Hola 2 \n" + "Hola 3 \n" + "Hola 4 \n";
        Files.writeString(rutaArchivo, contenido, StandardOpenOption.APPEND);
        
        // Leer del archivo
            List<String> lineas = Files.readAllLines(rutaArchivo, StandardCharsets.UTF_8);
            System.out.println("Contenido del archivo:");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        
            // Mostrar información del archivo
            System.out.println("Nombre del archivo: " + rutaArchivo.getFileName());
            System.out.println("Ruta absoluta: " + rutaArchivo.toAbsolutePath());
            System.out.println("Tamaño del archivo: " + Files.size(rutaArchivo) + " bytes");
    } catch (IOException e) {
    System.out.println("Ocurrió un error.");
        e.printStackTrace();
    }
    }
}
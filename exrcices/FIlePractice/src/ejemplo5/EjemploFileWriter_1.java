package ejemplo5;

import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter_1 {
    public static void main(String[] args) {
        String nombreArchivo = "ejemploFileWriter.txt";
        String contenido = "Este es un ejemplo de escritura usando la clase FileWriter.";

        try (FileWriter escritor = new FileWriter(nombreArchivo)) {
            escritor.write(contenido);
            System.out.println("Se ha escrito en el archivo usando FileWriter.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
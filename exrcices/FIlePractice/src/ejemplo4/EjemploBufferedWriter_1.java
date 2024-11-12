package ejemplo4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploBufferedWriter_1 {
    public static void main(String[] args) {
        String nombreArchivo = "ejemploBufferedWriter.txt";
        String contenido = "Este es un ejemplo de escritura usando la clase BufferedWriter.";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            escritor.write(contenido);
            System.out.println("Se ha escrito en el archivo usando BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
package ejemplo5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploFileWriter_2 {
    public static void main(String[] args) {
        String nombreArchivo = "archivoConPrintWriter.txt";

        try (FileWriter fw = new FileWriter(nombreArchivo);
             PrintWriter pw = new PrintWriter(fw)) {

            // Escribir diferentes tipos de datos en el archivo
            pw.println("Este es un ejemplo usando FileWriter con PrintWriter.");
            System.out.println("Contenido escrito en el archivo con éxito.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error durante la escritura.");
            e.printStackTrace();
        }
    }
}
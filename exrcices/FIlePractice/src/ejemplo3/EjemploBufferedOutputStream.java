package ejemplo3;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploBufferedOutputStream {
    public static void main(String[] args) {
        String nombreArchivo = "ejemploBufferedOutputStream.txt";
        String contenido = "Este es un ejemplo de escritura usando FileOutputStream y BufferedOutputStream.";

        try (FileOutputStream fos = new FileOutputStream(nombreArchivo);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(contenido.getBytes());
            System.out.println("Se ha escrito en el archivo usando BufferedOutputStream.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
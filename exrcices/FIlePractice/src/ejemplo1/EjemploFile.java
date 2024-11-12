package ejemplo1;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EjemploFile {
    public static void main(String[] args) {
        // Nombre del archivo
        //String nombreArchivo = "ejemplo.txt";

        // Crear un objeto File
        String rutaArchivo = "/Users/administrador/Documents/GitHub/2DAM-AccesoADatos/exrcices/FIlePractice/src/exemple.txt";
        File archivo = new File(rutaArchivo);
        

        try {
            // Crear el archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
            // Escribir en el archivo
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("Hola, este es un ejemplo de uso de la clase File en Java.");
            escritor.close();
            System.out.println("Se ha escrito en el archivo.");

            // Leer el contenido del archivo
            FileReader lector = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(lector);
            String linea;
            System.out.print("Contenido del archivo: ");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            bufferedReader.close();

            // Mostrar información del archivo
            if (archivo.exists()) {
                System.out.println("Nombre del archivo: " + archivo.getName());
                System.out.println("Ruta: " + archivo.getPath());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
                System.out.println("Puede escribirse: " + archivo.canWrite());
                System.out.println("Puede leerse: " + archivo.canRead());
                System.out.println("Tamaño: " + archivo.length());
                System.out.println("Tamaño del archivo: " + archivo.length() + " bytes");
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
    }
}
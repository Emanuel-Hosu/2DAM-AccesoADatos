package ejemplo4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class EjemploBufferedWriter_2 {
    public static void main(String[] args) {
        Path path = Path.of("miejemplo.txt");
        if (!Files.exists(path)) {
            try {
               Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String content = "hola, que tal? \n";
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            bufferedWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
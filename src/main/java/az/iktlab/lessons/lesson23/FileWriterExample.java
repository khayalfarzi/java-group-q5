package az.iktlab.lessons.lesson23;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        File file = new File("/Applications/idea/java-group-q5-git/src/main/resources/files/test.txt");

        try (FileWriter writer = new FileWriter(file)) {

            writer.write("Salam dunya\n");
            writer.write("Salam dunya\n");
            writer.write("Salam dunya\n");
            writer.write("Salam dunya\n");
            writer.write("Salam dunya\n");
            writer.write("Salam dunya\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

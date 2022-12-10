package az.iktlab.lessons.lesson23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderEx {

    public static void main(String[] args) {

        File file = new File("/Applications/idea/java-group-q5-git/src/main/resources/files/test.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package az.iktlab.lessons.lesson23;

import java.io.File;
import java.io.IOException;

public class Files {

    public static void main(String[] args) {

        File file = new File("/Applications/idea/java-group-q5-git/src/main/resources/files/test.txt");

        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getTotalSpace());
        System.out.println(file.length());


    }
}
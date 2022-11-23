package az.iktlab.lessons.lesson18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClazz {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM HH:mm");
        System.out.println(LocalDateTime.now().format(formatter));
    }
}

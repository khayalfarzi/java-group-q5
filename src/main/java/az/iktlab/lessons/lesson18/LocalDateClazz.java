package az.iktlab.lessons.lesson18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateClazz {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println(date.plusDays(5));
        System.out.println(date.plusYears(-12));
        System.out.println(date.minusYears(-2));

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

        date = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(date.format(formatter));
    }
}

package az.iktlab.lessons.lesson18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeZakir {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.now().plusHours(2));
        System.out.println(LocalTime.now().minusHours(2));
        System.out.println(LocalTime.now().plusMinutes(25));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH/mm/ss/ms");
        System.out.println(time.format(formatter));
    }
}

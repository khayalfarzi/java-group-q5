package az.iktlab.lessons.lesson22;

import java.util.Arrays;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {

        List<String> colors = Arrays.asList("Red", "Green", "Black", "White", "Pink");

        for (String color : colors) {
            System.out.println(color);
        }

        colors.forEach(color -> {
            System.out.println(color);
        });
    }
}

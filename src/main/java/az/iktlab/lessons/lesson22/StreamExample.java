package az.iktlab.lessons.lesson22;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamExample {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<String> colors =
            Arrays.asList("Red", "Green", "Orange", "White", "Black");

    public static void main(String[] args) {

        String input = getInput();

        String result = getColor(input);

        System.out.println(result);
    }

    private static String getInput() {
        System.out.print("Enter color: ");
        return sc.nextLine();
    }

    private static String getColor(String input) {
        return colors.stream()
                .filter(color -> color.equalsIgnoreCase(input))
                .findAny()
                .orElse("Not Found");
    }
}

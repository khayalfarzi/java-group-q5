package az.iktlab.lessons.lesson19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 6, 4, 2, 3, 5, 7));
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}

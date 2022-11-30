package az.iktlab.lessons.lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // todo: call scanner

        int i = 0, j = 0;

        showElementByIndexes(i, j);
    }

    public static int findSecondMaxNumber(List<Integer> arr) {
        int max = Collections.max(arr);
        arr.remove((Integer) max);
        return Collections.max(arr);
    }

    public static void showElementByIndexes(int i, int j) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(41, 77, 74, 22, 44));
        arr.add(List.of(12));
        arr.add(List.of(37, 34, 36, 52));
        arr.add(List.of());
        arr.add(List.of(20, 22, 33));

        //todo: Complete code snip
    }
}

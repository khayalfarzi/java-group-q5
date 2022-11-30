package az.iktlab.lessons.lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListExample {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the indexes: ");
        String input = sc.nextLine();
        int i = Integer.parseInt(input.split(",")[0]);
        int j = Integer.parseInt(input.split(",")[1]);

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

        if (arr.size() < i) {
            System.out.println("ERROR");
            return;
        }

        if (arr.get(i-1).size() < j) {
            System.out.println("ERROR");
            return;
        }

        System.out.println(arr.get(i-1).get(j-1));
    }
}

package az.iktlab.lessons.lesson9;

import java.util.Scanner;

public class ArrFindMaxAndMin {

    public static void main(String[] args) {

        System.out.println("===================> Welcome to the app ! <===================");
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 78, 9, 2, 3, 56, -2, 0, 8, 99};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // first way
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];

            if (max < elem) max = elem;
            if (min > elem) min = elem;
        }

        // second way
        for (int elem : arr) {
            if (max < elem) max = elem;
            if (min > elem) min = elem;
        }
        System.out.printf("Minimum element is: %s\n", min);
        System.out.printf("Maximum element is: %s\n", max);

        System.out.println("===================> Good bye ! <===================");
    }
}

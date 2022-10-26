package az.iktlab.lessons.lesson9;

import java.util.Arrays;

public class ReverseArrays {

    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 9, 2, 6, 7, 4};

        System.out.printf("Original array : %s\n", Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i]; // 5, 8, 1, 9

            arr[i] = arr[arr.length - i - 1]; //[4, 7, 6, 2, 0, 0, 0, 0]
            arr[arr.length - i - 1] = temp; // [4, 7, 6, 2, 9, 1, 8, 5]
        }

        System.out.printf("Reverse array : %s\n", Arrays.toString(arr));
    }

}

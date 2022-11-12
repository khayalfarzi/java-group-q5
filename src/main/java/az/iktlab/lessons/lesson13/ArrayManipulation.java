package az.iktlab.lessons.lesson13;

import java.util.Arrays;

public class ArrayManipulation {

    public static int findSecondMaxNumber(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;

        int idealNumber = arr[length - 2];
        int lastNumber = arr[length - 1];

        if (idealNumber == lastNumber)
            for (int i = length - 1; i >= 0; i--)
                if (arr[i] != idealNumber) return arr[i];
        return idealNumber;
    }
}

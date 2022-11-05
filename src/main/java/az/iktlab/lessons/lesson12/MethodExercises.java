package az.iktlab.lessons.lesson12;

import java.util.Arrays;

public class MethodExercises {

    public static boolean isEven(int number) {
        if (number == 0) return false;

        while (number != 0) {

            if ((number % 10) % 2 != 0)
                return false;

            number /= 10;
        }
        return true;
    }

    public static String findCommonElements(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);
        int[] newArr = new int[length];
        int index = 0;

        for (int elem : arr1) {
            if (isExist(elem, arr2)) {
                newArr[index] = elem;
                index++;
            }
        }

        /**
         *  arr1 = [1, 2, 3, 4]
         *  arr2 = [2, 3, 4, 5, 6]
         *
         *  newArr = [2, 3, 4, 0]
         * */
        Arrays.sort(newArr);

        return Arrays.toString(cleanUpZeros(newArr));
    }

    public static boolean isExist(int element, int[] arr2) {
        for (int elem : arr2) {
            if (elem == element)
                return true;
        }
        return false;
    }

    public static int[] cleanUpZeros(int[] arr) {

        int size = 0;
        for (int elem : arr) {
            if (elem != 0)
                size++; // 3
        }

        int index = 0;
        int[] cleanArray = new int[size];
        for (int elem : arr) {
            if (elem != 0) {
                cleanArray[index] = elem;
                index++;
            }
        }

        return cleanArray;
    }
}

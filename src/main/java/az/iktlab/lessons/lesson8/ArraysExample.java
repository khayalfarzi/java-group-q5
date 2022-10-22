package az.iktlab.lessons.lesson8;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        // ....

        int[] is = new int[5]; // [0, 0, 0, 0, 0]
        //  0  1  2  3  4
        is[0] = 2; // [2, 0, 0, 0, 0]
        is[1] = 4; // [2, 4, 0, 0, 0]
        is[2] = 34; // [2, 4, 34, 0, 0]
        is[3] = -3; // [2, 4, 34, -3, 0]
        is[4] = 23; // [2, 4, 34, -3, 23]

        System.out.println(Arrays.toString(is));

        System.out.println(is[3]); // -3
        System.out.println(is[0]); // 2

        int[] iss = {4, 2, 7, 6, 8, 4, 3, 2, 2, 4, 2, 2, 2, 2, 2, 2};
        System.out.println(iss[6]);
        System.out.println(iss[7]);
        System.out.println(iss[8]);
        System.out.println(iss[9]);

        String[] strs = {"Bmw", "Mercedes", "Volvo"};
        System.out.println(Arrays.toString(strs));

        for (int k = 0; k < strs.length; k++) {
            System.out.println(strs[k]);
        }
    }
}

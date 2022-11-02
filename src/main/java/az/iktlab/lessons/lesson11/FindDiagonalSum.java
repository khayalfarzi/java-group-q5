package az.iktlab.lessons.lesson11;

public class FindDiagonalSum {

    public static int findDiagSum(int[][] arr) {
        /**
         *  1 2 3
         *  4 5 6
         *  7 8 9
         *
         *  [i][i]
         *  [i][arr.length - 1 - i]
         * */
        int diagSum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) diagSum += arr[i][i] + arr[size - i - 1][i];
        return diagSum;
    }
}

package az.iktlab.lessons.lesson15;

public class WarmUp {

    public static int findMajorityElement(int[] arr) {
        int middle = arr.length / 2;

        for (int elem : arr)
            if (isGreaterThan(findCount(elem, arr), middle))
                return elem;
        return 0;
    }

    public static String findClosestNumbers(int[] arr) {
        return "";
    }

    private static int findCount(int element, int[] arr) {
        int count = 0;

        for (int elem : arr)
            if (elem == element)
                count++;

        return count;
    }

    private static boolean isGreaterThan(int element, int middle) {
        return element >= middle;
    }
}

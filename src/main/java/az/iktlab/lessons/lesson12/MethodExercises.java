package az.iktlab.lessons.lesson12;

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

    public static int[] findCommonElements(int[] arr1, int[] arr2) {

        return new int[]{};
    }
}

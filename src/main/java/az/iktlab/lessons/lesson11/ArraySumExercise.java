package az.iktlab.lessons.lesson11;

import java.util.stream.IntStream;

public class ArraySumExercise {

    public static int getSum(int[] arr) {
        return IntStream.of(arr).sum();
    }
}

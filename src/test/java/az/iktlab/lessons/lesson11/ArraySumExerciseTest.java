package az.iktlab.lessons.lesson11;

import org.junit.Assert;
import org.junit.Test;

public class ArraySumExerciseTest {

    @Test
    public void testArraySum() {

        Assert.assertEquals(24, ArraySumExercise.getSum(new int[]{4, 9, 0, 6, 5}));
        Assert.assertEquals(10, ArraySumExercise.getSum(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(219, ArraySumExercise.getSum(new int[]{90, 12, 28, 89}));
        Assert.assertEquals(2182, ArraySumExercise.getSum(new int[]{1234, 657, 89, 123, 1, 2, 3, 4, 5, 56, 8}));
        Assert.assertEquals(278, ArraySumExercise.getSum(new int[]{54, 78, 34, 56, 56}));
        Assert.assertEquals(15, ArraySumExercise.getSum(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }
}

package az.iktlab.lessons.lesson12;

import org.junit.Assert;
import org.junit.Test;

import static az.iktlab.lessons.lesson12.MethodExercises.findCommonElements;

public class MethodExercisesTest {

    @Test
    public void isEvenTest() {
        Assert.assertFalse(MethodExercises.isEven(123));
        Assert.assertTrue(MethodExercises.isEven(2460));
        Assert.assertFalse(MethodExercises.isEven(209683));
        Assert.assertFalse(MethodExercises.isEven(208683));
        Assert.assertFalse(MethodExercises.isEven(20968863));
        Assert.assertTrue(MethodExercises.isEven(460082));
    }

    public void findCommonElementsTest() {
        Assert.assertEquals(new int[]{8, 9}, findCommonElements(new int[]{1, 2, 3, 4, 5, 67, 8, 9}, new int[]{6, 7, 8, 9}));
        Assert.assertEquals(new int[]{2, 3, 88, 99, 123}, findCommonElements(
                new int[]{134, 256, 789, 2, 567, 9864356, 1290, 9841230, 189034, 3, 99, 123},
                new int[]{2, 98645763, 9542683, 71234, 123, 123, 123, 4567, 2345566, 90, 99, 88, 3}));
        Assert.assertEquals(new int[]{1, 23, 456, 654}, findCommonElements(new int[]{456, 123, 654, 1, 23, 23, 34, 34, 18, 901}, new int[]{476, 1, 343, 456, 901, 809, 812, 654, 398163, 0, 285}));
    }
}

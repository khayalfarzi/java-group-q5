package az.iktlab.lessons.lesson13_14;

import org.junit.Assert;
import org.junit.Test;

import static az.iktlab.lessons.lesson13_14.ArrayManipulation.findSecondMaxNumber;

public class ArrayManipulationTest {

    @Test
    public void findSecondMaxNumberTest() {

        Assert.assertEquals(5, findSecondMaxNumber(new int[]{1, 2, 1, 1, 1, 12, 3, 5}));
        Assert.assertEquals(8, findSecondMaxNumber(new int[]{8, 8}));
        Assert.assertEquals(456, findSecondMaxNumber(new int[]{5, 7, 123, 456, 567, 45, 45, 45, 12, 1, 11, 1, 2, 3}));
        Assert.assertEquals(89, findSecondMaxNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 24, 34, 56, 78, 98, 67, 89}));
        Assert.assertEquals(0, findSecondMaxNumber(new int[]{-2, 3, -4, -5, -6, 0, -78, -98}));
    }
}

package az.iktlab.lessons.lesson15;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static az.iktlab.lessons.lesson15.WarmUp.findClosestNumbers;
import static az.iktlab.lessons.lesson15.WarmUp.findMajorityElement;

public class WarmUpTest {

    @Test
    public void findMajorityElementTest(){
        Assert.assertEquals(1, findMajorityElement(new int[]{1, 2, 3, 1, 1, 1, 1, 1}));
        Assert.assertEquals(8, findMajorityElement(new int[]{2, 5, 8, 4, 8, 8, 8, 4, 8, 8, 4, 8, 5, 8, 8}));
        Assert.assertEquals(3, findMajorityElement(new int[]{3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 6, 9, 5}));
    }

    @Test
    public void findClosestNumbersTest(){
        Assert.assertEquals(Arrays.toString(new int[]{4, -5}), findClosestNumbers(new int[]{6, 4, -5, 0, 1, 2, 9, 3, -7, 4}));
        Assert.assertEquals(Arrays.toString(new int[]{5, -5}), findClosestNumbers(new int[]{1, 2, 3, 4, 5, 0, -5, -6, -7, -8, -9}));
        Assert.assertEquals(Arrays.toString(new int[]{-128, 100}), findClosestNumbers(new int[]{12, -128, -129, 6, 5, 4, 3, 2, 1, 100}));
    }
}

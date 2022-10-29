package az.iktlab.lessons.lesson10;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestExample {

    @Test
    public void findMaxTest() {

        Assert.assertEquals(12, MathClazz.findMax(3, 9, 12));
        Assert.assertEquals(1, MathClazz.findMax(-2, 1, 0));
        Assert.assertEquals(124, MathClazz.findMax(32, 123, 124));
        Assert.assertEquals(1228, MathClazz.findMax(3, 999, 1228));
    }
}

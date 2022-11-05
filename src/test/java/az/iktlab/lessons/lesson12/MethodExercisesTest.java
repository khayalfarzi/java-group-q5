package az.iktlab.lessons.lesson12;

import org.junit.Assert;
import org.junit.Test;

public class MethodExercisesTest {

    @Test
    public void isEvenTest() {
        Assert.assertFalse(MethodExercises.isEven(123));
        Assert.assertTrue(MethodExercises.isEven(2460));
        Assert.assertFalse(MethodExercises.isEven(209683));
        Assert.assertFalse(MethodExercises.isEven(208683));
        Assert.assertFalse(MethodExercises.isEven(20968863));
        Assert.assertTrue(MethodExercises.isEven(465082));
    }
}

package az.iktlab.lessons.lesson20;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static az.iktlab.lessons.lesson20.ListExample.findSecondMaxNumber;

public class ArrayManipulationTest {

    @Test
    public void findSecondMaxNumberTest() {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);
        arr.add(1);
        arr.add(12);
        arr.add(3);
        arr.add(5);
        Assert.assertEquals(5, findSecondMaxNumber(arr));
    }
}

package az.iktlab.lessons.lesson11;

import org.junit.Assert;
import org.junit.Test;

public class FindDiagonalSumTest {

    @Test
    public void findDiagSumTest() {

        Assert.assertEquals(30, FindDiagonalSum.findDiagSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        Assert.assertEquals(43, FindDiagonalSum.findDiagSum(new int[][]{{7, 2, 6}, {6, 8, 6}, {7, 7, 7}}));
        Assert.assertEquals(8, FindDiagonalSum.findDiagSum(new int[][]{{1, 2, 1}, {1, 2, 1}, {1, 2, 1}}));
    }
}

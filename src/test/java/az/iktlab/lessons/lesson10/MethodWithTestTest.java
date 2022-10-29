package az.iktlab.lessons.lesson10;

import org.junit.Assert;
import org.junit.Test;

public class MethodWithTestTest {

    @Test
    public void countWordsTest() {
        Assert.assertEquals(2, MethodWithTest.countWords("Salam Q5"));
        Assert.assertEquals(5, MethodWithTest.countWords("Welcome to theJava world"));
        Assert.assertEquals(9, MethodWithTest.countWords("This is not a simple.But this is simple..."));
        Assert.assertEquals(9, MethodWithTest.countWords("The quick brown fox jumps over the lazy dog."));
    }
}

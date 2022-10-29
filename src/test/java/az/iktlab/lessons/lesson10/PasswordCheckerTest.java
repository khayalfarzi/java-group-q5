package az.iktlab.lessons.lesson10;

import org.junit.Assert;
import org.junit.Test;

public class PasswordCheckerTest {

    @Test
    public void checkPasswordForCorrectWay() {
        Assert.assertEquals("Password is correct!", PasswordChecker.checkPassword("abcA1234567"));
    }

    @Test
    public void checkPassword_WhenLengthIsNotCorrect() {
        Assert.assertEquals("A password must have at least ten characters", PasswordChecker.checkPassword("123"));
        Assert.assertEquals("A password must have at least ten characters", PasswordChecker.checkPassword("123432"));
        Assert.assertEquals("A password must have at least ten characters", PasswordChecker.checkPassword("abcfdg"));
        Assert.assertEquals("A password must have at least ten characters", PasswordChecker.checkPassword("aqswedfrty"));
    }

    @Test
    public void checkPassword_WhenThereIsNotA() {
        Assert.assertEquals("A is not found", PasswordChecker.checkPassword("a1234hnfghxjscj"));
        Assert.assertEquals("A is not found", PasswordChecker.checkPassword("12345asgdfs"));
        Assert.assertEquals("A is not found", PasswordChecker.checkPassword("hvcjhsvdbaaa"));
        Assert.assertEquals("A is not found", PasswordChecker.checkPassword("gjhjcvsabjhbaaaBBCD"));
    }
}

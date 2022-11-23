package az.iktlab.lessons.lesson18;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("salam", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("SaLam dunya");

        System.out.println(matcher.find());

        String s = "Hello0Regular1Expression.Test";
        System.out.println(Arrays.toString(s.split("[0-9]")));
    }
}

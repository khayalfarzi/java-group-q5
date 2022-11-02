package az.iktlab.lessons.lesson11;

public class FactorialCalculator {

    public static void main(String[] args) {

        long fac = factorial(5);
        System.out.println(fac);
    }

    public static long factorial(int digit) {
        return digit == 0 ? 1 : digit * factorial(digit - 1);
    }
}

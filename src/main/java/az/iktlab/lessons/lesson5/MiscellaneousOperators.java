package az.iktlab.lessons.lesson5;

public class MiscellaneousOperators {

    public static void main(String[] args) {

        int a = 5, b = 5, result;

        // if a > b then result = 5+4 else result = 5-4

        if (a > b) {
            result = a + b;
        } else if (a == b) {
            result = 1;
        } else {
            result = a - b;
        }

        System.out.printf("Result is: %s\n", result); // 1

        result = a > b ? (a + b) : (a - b); // 0
        System.out.printf("Result with simple trnr op: %s\n", result); // 9

        result = a > b ? (a + b) : a == b ? 0 : (a - b);// 0
        System.out.printf("Result with hard trnr op: %s\n", result); // 9

    }
}

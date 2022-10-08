package az.iktlab.lessons.lesson4;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 1;

        System.out.printf("Equal: %s\n", (a == b));             // false
        System.out.printf("Not Equal: %s\n", (a != b));         // true
        System.out.printf("Greater than: %s\n", (a > b));       // true
        System.out.printf("Less than: %s\n", (a < b));          // false
        System.out.printf("Greater or equal: %s\n", (a >= b));  // true
        System.out.printf("Less orr equal: %s\n", (a <= b));    // false
    }
}

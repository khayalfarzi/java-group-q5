package az.iktlab.lessons.lesson4;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 21;

        System.out.printf("add: %s\n", (a + b));
        System.out.printf("sub: %s\n", (a - b));
        System.out.printf("Multiple: %s\n", (a * b));
        System.out.printf("Div: %s\n", (b / a));
        System.out.printf("Mod: %s\n", (b % a)); // 21/10 = 2 (1 qaliq) -> 1
        System.out.printf("Increment: %s\n", a++);
        System.out.printf("Pos Increment: %s\n", ++a);
        System.out.printf("Decrement: %s\n", b--);
        System.out.printf("Pos Decrement: %s\n", --b);
    }
}

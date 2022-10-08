package az.iktlab.lessons.lesson4;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.printf("Logical and %s\n", (a && b));// false
        System.out.printf("Logical or %s\n", (a || b));// true
        System.out.printf("Logical and %s\n", (!a));// false

        boolean c = false, d = false, e = false, f = false;

        System.out.println("==========================");
        if ((c = true) | (d = true)) {
            System.out.println("Cond 1");
        }

        if ((e = false) & (f = true)) {
            System.out.println("Cond 2");
        }

        System.out.printf("c : %s\n", c);
        System.out.printf("d : %s\n", d);
        System.out.printf("e : %s\n", e);
        System.out.printf("f : %s\n", f);

        System.out.println("==========================");

    }
}

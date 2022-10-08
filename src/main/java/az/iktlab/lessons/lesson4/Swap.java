package az.iktlab.lessons.lesson4;

public class Swap {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 0;

        System.out.printf("before swap a: %s\n", a);
        System.out.printf("before swap b: %s\n", b);

        c = a;
        a = b;
        b = c;

        System.out.printf("after swap a: %s\n", a);
        System.out.printf("after swap b: %s\n", b);
    }
}

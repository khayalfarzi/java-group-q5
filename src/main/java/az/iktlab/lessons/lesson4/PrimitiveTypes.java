package az.iktlab.lessons.lesson4;

public class PrimitiveTypes {

    public static void main(String[] args) {

        // boolean
        boolean b = true;
        boolean b1 = false;

        System.out.printf("b: %s\n", b);
        System.out.printf("b1: %s\n", b1);

        byte bb = 12;
        byte bb1, bb2, bb3, bb4 = 5;

        bb1 = 4;
        bb2 = 7;
        bb3 = bb2;

        System.out.println(bb); // 12
        System.out.println(bb1); // 4
        System.out.println(bb2); // 7
        System.out.println(bb3); // 7
        System.out.println(bb4); // 5

        char c = 'A';
        char c1 = 'a';

        System.out.println(c);
        System.out.println(c1);

        short s = 123;
        int i = 124;
        long l = 234;

        double d = 12;
        double d1 = 12.2;
        int i1 = (int) 12.2;

        System.out.printf("double d: %s\n", d); // 12.0

        // int a = 5;
        // int b = 6;
        // a= 6
        //b=5;
    }
}

package az.iktlab.lessons.lesson4;

public class SwapOptimalWay {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.printf("before swap a: %s\n", a);
        System.out.printf("before swap b: %s\n", b);

        a = (a + b); // 11
        b = a - b; // 5
        a = a - b; // 6

        System.out.printf("after swap a: %s\n", a);
        System.out.printf("after swap b: %s\n", b);

    }
}

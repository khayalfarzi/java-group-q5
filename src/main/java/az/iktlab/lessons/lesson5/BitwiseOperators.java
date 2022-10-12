package az.iktlab.lessons.lesson5;

public class BitwiseOperators {

    public static void main(String[] args) {


        int a = 5, b = 4, result;

        result = a & b;

        System.out.printf("And: %s\n", result); // 0101 & 0100 = 0100 -> 4

        result = a | b;
        System.out.printf("Or: %s\n", result); // 0101 | 0100 = 0101 -> 5

        result = a ^ b;
        System.out.printf("Xor: %s\n", result); // 0101 ^ 0100 = 0001 -> 1

        result = ~a;
        System.out.printf("Not: %s\n", result); // ~0101 = 1010 -> 10

        result = b << 2;
        System.out.printf("Left shift: %s\n", result); // ~0100 = 1010 -> 10
    }
}

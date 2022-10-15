package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("first is greater than second");
        } else if (first < second) {
            System.out.println("Second is greater than first");
        } else {
            System.out.println("Two numbers are equal");
        }

        int max = Math.max(first, second);

        System.out.println(max);
    }
}

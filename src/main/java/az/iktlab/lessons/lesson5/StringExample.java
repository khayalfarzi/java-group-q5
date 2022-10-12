package az.iktlab.lessons.lesson5;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        scanner.nextLine();

        String s = "Hello";

        System.out.println(s);

        String s1 = "Hello Java group J5";

        System.out.println(s1);

        String s2 = new String("Hello");

        System.out.println(s2.toUpperCase()); // HELLO
        System.out.println(s2.contains("e")); // true
    }
}

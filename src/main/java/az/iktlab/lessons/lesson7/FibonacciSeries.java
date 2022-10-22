package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int number = sc.nextInt(); // 5
        int index = 0;
        long firsFib = 0;
        long secondFib = 1;

        System.out.println(firsFib); // 0
        System.out.println(secondFib); // 1
        while (index < number - 2) { // 3

            long fib = firsFib + secondFib; // 1 , 2, 3

            System.out.println(fib); // 1, 2, 3

            long temp = secondFib; // 1, 1, 2
            secondFib = fib; // 1, 2, 3
            firsFib = temp; // 1, 1, 2

            index++; // 1, 2, 3
        }
    }
}

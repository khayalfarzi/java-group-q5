package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class WhileLoopExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt(); // 3

        int sum = 0;
        int index = 0;

        while (index <= number) { // yes
            sum = sum + index; // 1 + 2=3 + 3 = 6
            index++;
        }

        System.out.printf("Sum is: %s\n", sum);
    }
}

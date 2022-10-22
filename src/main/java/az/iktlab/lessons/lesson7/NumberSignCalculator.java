package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class NumberSignCalculator {

    public static void main(String[] args) {

        System.out.println("===================> Welcome to the application <===================");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        boolean flag = true;

        while (flag) {

            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            System.out.print("Do you want to exit ? (enter 'yes' or 'no'): ");
            String key = sc.next();

            if (number > 0)
                positives++;
            else if (number < 0)
                negatives++;
            else zeros++;

            if (key.equalsIgnoreCase("yes"))
                flag = false;
        }

        System.out.println();
        System.out.println("Thank you for calculating your numbers !\n" +
                "Your result is: ");
        System.out.printf("Positives: %s\n", positives);
        System.out.printf("Negatives: %s\n", negatives);
        System.out.printf("Zeros: %s\n", zeros);

        System.out.println("===================> Good bye! <===================");
    }
}

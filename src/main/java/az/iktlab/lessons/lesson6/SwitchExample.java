package az.iktlab.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // if else case
//        if (number == 0) {
//            System.out.println("Daxil etdiyiniz eded: " + number);
//        } else if (number == 1) {
//            System.out.println("Daxil etdiyiniz eded: " + number);
//        } else if (number == 2) {
//            System.out.println("Daxil etdiyiniz eded: " + number);
//        } else {
//            System.out.println("Daxil etdiyiniz yanlishdir");
//        }

        // switch case
        switch (number) {
            case 0:
                System.out.println("Daxil etdiyiniz eded: " + number);
                break;
            case 1:
                System.out.println("Daxil etdiyiniz eded: " + number);
                break;
            case 2:
                System.out.println("Daxil etdiyiniz eded: " + number);
                break;
            default:
                System.out.println("Daxil etdiyiniz eded yanlishdir");
        }

        Random rnd = new Random();
        rnd.nextInt(100);
    }
}

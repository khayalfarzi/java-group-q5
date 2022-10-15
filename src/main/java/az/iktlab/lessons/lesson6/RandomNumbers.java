package az.iktlab.lessons.lesson6;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        System.out.println("==========> Welcome to the Random numbers program <==========");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int rndNumber = rnd.nextInt(101);
        boolean flag = true;

        while (flag) {

            if (number == rndNumber) {
                System.out.println("Congratulations !!!");

                flag = false;
            } else if (number > rndNumber) {
                System.out.println("Your number is too big. Please, try again..");

                System.out.print("Enter number again: ");
                number = sc.nextInt();
            } else {
                System.out.println("Your number is too small. Please, try again..");

                System.out.print("Enter number again: ");
                number = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("==========> Good bye <==========");

    }
}

package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        sc.nextLine();
        String b = sc.nextLine();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.printf("a: %s\n", a);
        System.out.printf("b: %s\n", b);
        System.out.printf("c: %s\n", c);
    }
}

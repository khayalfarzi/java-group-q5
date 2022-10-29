package az.iktlab.lessons.lesson10;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = sc.next();

        if (password.length() < 10) {
            System.out.println("A password must have at least ten characters");
        } else if (!containsBigLetter(password.charAt(0))) {
            System.out.println("Password is incorrect");
        } else {
            for (int i = 0; i < password.length(); i++) {

                char c = password.charAt(i);

                if (!containsLetters(c)) {
                    System.out.println("A password consists of only letters and digits.");
                } else if (!containsNumbers(c)) {
                    System.out.println("A password consists of only letters and digits.");
                } else {
                    System.out.println("Password is correct !");
                }
            }
        }
    }

    public static boolean containsLetters(char c) {
        boolean key = false;

        for (char i = 'A', j = 'a'; i <= 'Z'; i++, j++) {

            if (c == i) {
                key = true;
                break;
            }

            if (c == j) {
                key = true;
                break;
            }
        }

        return key;
    }

    public static boolean containsNumbers(char c) {

        boolean key = false;
        for (char i = '0'; i < '9'; i++) {
            if (c == i) {
                key = true;
                break;
            }
        }

        return key;
    }

    public static boolean containsBigLetter(char c) {

        boolean key = false;
        for (char i = 'A'; i < 'Z'; i++) {

            if (c == i) {
                key = true;
                break;
            }
        }

        return key;
    }

    public static String checkPassword(String password) {

        if (password.length() <= 10) {
            return "A password must have at least ten characters";
        } else if (!password.contains("A")) {
            return "A is not found";
        } else return "Password is correct!";
    }
}

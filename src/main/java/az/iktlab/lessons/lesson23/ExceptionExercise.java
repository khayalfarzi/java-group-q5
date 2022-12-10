package az.iktlab.lessons.lesson23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {

    public static void main(String[] args) {
        int firstNum = getNumber("first number");
        int secondNum = getNumber("second number");

        int result = div(firstNum, secondNum);

        System.out.println(result);
    }

    private static Integer div(int firstNum, int secondNum) {
        try {
            return firstNum / secondNum;
        } catch (ArithmeticException ex) {
            System.out.println("Second number can not be zero. " + ex.getMessage());
            throw ex;
        }
    }

    private static Integer getNumber(String numberDefinition) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter %s : ", numberDefinition);
            return sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid data type. Please enter valid number");
            return getNumber(numberDefinition);
        } catch (RuntimeException ex) {
            System.out.println("An exception occurred: " + ex.getMessage());
            throw ex;
        }
    }
}

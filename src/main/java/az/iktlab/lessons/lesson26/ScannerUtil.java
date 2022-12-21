package az.iktlab.lessons.lesson26;

import java.util.Scanner;

public class ScannerUtil {

    private static final Scanner sc = new Scanner(System.in);

    public static Commands getCommand() {
        return Commands.valueOf(sc.nextLine().toUpperCase());
    }

    public static Person getPersonData() {

        Person person = new Person();

        System.out.print("Enter name: \n");
        person.setName(sc.nextLine());

        System.out.print("Enter surname: \n");
        person.setSurname(sc.nextLine());

        System.out.print("Enter father name: \n");
        person.setFatherName(sc.nextLine());

        System.out.print("Enter age: \n");
        person.setAge(sc.nextInt());

        System.out.print("Enter gender: (MALE/FEMALE) \n");
        person.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

        return person;
    }

}

package az.iktlab.lessons.lesson27.smallapp.util;

import az.iktlab.lessons.lesson27.smallapp.model.Commands;
import az.iktlab.lessons.lesson27.smallapp.model.Gender;
import az.iktlab.lessons.lesson27.smallapp.model.Person;
import az.iktlab.lessons.lesson27.smallapp.model.User;

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

        sc.nextLine();
        System.out.print("Enter gender: (MALE/FEMALE) \n");
        person.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

        return person;
    }

    public static User getUserData() {
        User user = new User();

        System.out.print("Enter username: \n");
        user.setUsername(sc.nextLine());

        System.out.print("Enter password: \n");
        user.setPassword(sc.nextLine());

        return user;
    }

    public static Long getPersonId() {
        System.out.print("Enter person id: \n");
        Long id = sc.nextLong();
        sc.nextLine();
        return id;
    }
}

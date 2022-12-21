package az.iktlab.lessons.lesson26;

import java.util.Scanner;

public class Application {

    private static final PersonService personService = new PersonService();
    private static final UserService userService = new UserService();

    public static void run() {
        boolean flag = true;

        while (flag) {
            showCommands();
            Commands cmd = ScannerUtil.getCommand();

            switch (cmd) {
                case SP:
                    Person person = ScannerUtil.getPersonData();
                    personService.savePerson(person);
                    break;
                case RU:
                    userService.registerUser();
                    break;
                case SHP:
                    personService.showPeople();
                    break;
                case EXIT:
                    flag = false;
            }
        }
    }

    private static void showCommands() {
        System.out.print("Enter command: \n" +
                " commands: \n" +
                "1. (sp)   - " + Commands.SP.getDescription() + "\n" +
                "2. (ru)   - " + Commands.RU.getDescription() + "\n" +
                "3. (shp)  - " + Commands.SHP.getDescription() + "\n" +
                "4. (exit) - " + Commands.EXIT.getDescription() + "\n");
    }
}

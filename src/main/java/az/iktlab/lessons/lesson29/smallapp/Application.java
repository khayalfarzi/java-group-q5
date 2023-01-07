package az.iktlab.lessons.lesson29.smallapp;

import az.iktlab.lessons.lesson29.smallapp.model.Commands;
import az.iktlab.lessons.lesson29.smallapp.model.Person;
import az.iktlab.lessons.lesson29.smallapp.model.User;
import az.iktlab.lessons.lesson29.smallapp.service.PersonService;
import az.iktlab.lessons.lesson29.smallapp.service.UserService;

import static az.iktlab.lessons.lesson29.smallapp.util.ScannerUtil.*;

public class Application {

    private static final PersonService personService = new PersonService();
    private static final UserService userService = new UserService();

    public static void run() {
        boolean flag = true;

        while (flag) {
            showCommands();
            Commands cmd = getCommand();

            switch (cmd) {
                case SP:
                    Person person = getPersonData();
                    personService.savePerson(person);
                    break;
                case RU:
                    User user = getUserData();
                    Long personId = getPersonId();
                    userService.registerUser(user, personId);
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
        System.out.print("Commands: \n" +
                "1. (sp)   - " + Commands.SP.getDescription() + "\n" +
                "2. (ru)   - " + Commands.RU.getDescription() + "\n" +
                "3. (shp)  - " + Commands.SHP.getDescription() + "\n" +
                "4. (exit) - " + Commands.EXIT.getDescription() + "\n" + "Enter command: ");
    }
}

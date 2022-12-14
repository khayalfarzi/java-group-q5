package az.iktlab.lessons.lesson24.exercise;

public class Application {

    public static void run() {

        Person father = new Person("Adam", "Not defined");
        Person mother = new Person("Havva", "Not defined");

        Person child = new Person("Habil", "Adamoghlu", 45, Gender.MALE, father, mother);

        System.out.println(child);
    }
}

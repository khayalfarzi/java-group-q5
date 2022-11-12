package az.iktlab.lessons.lesson13;

public class Human {

    private final String name;
    private final String surname;
    private final int age;

    public Human(String name, String surname, int age) {
        if (name.length() < 3) {
            System.out.println("Name length can not be less than 3");
            this.name = null;
        } else this.name = name;

        if (age < 0) {
            System.out.println("Age can not be negative");
            this.age = 0;
        } else this.age = age;

        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

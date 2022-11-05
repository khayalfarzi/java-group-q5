package az.iktlab.lessons.lesson12;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();

        p.name = "Khayal";
        System.out.println(p.name);

        Person p1 = new Person("This is a name");
        System.out.println(p1.name);

        Person p2 = new Person("This is a second name", "This is a surname");
        System.out.println(p2.name);
        System.out.println(p2.surname);

        Person p3 = new Person(1998);
        System.out.println(p3.age);

        Person p4 = new Person("Khayal", "Farziyev", 1998, 0);
        System.out.println(p4);

        Person p5 = new Person("Khayal", "Farziyev", 1998, 5);
        System.out.println(p5);

        Person p6 = new Person("Khayal", "Farziyev", 2023, 0);
        System.out.println(p6);

        Person p7 = new Person("Shahana", "Loghmanli", 1993, 1);
        System.out.println(p7);
    }
}

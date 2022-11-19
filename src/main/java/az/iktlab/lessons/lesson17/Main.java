package az.iktlab.lessons.lesson17;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Person name");
        p.setGender(Person.Gender.MALE);

        System.out.println(p);
    }
}

package az.iktlab.lessons.lesson13_14;

public class Person {

    public static double pi = 3.14;
    public static final double pii = 3.14;

    private String name;
    public String surname;
    protected int age;
    String gender;

    public Person() {
        System.out.println("This is constructor");
    }

    static {
        System.out.println("This is a static block");
    }

    public static void staticMethod() {
        System.out.println("This is static method");
    }
}

package az.iktlab.lessons.lesson18;

public class Human {

    private String name;
    private String surname;

    public Human() {
        System.out.println("Human empty constructor");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is running...");
    }
}

package az.iktlab.lessons.lesson15;

public class Teacher extends Person implements Ability {
    @Override
    public void run() {
        System.out.println("Teacher is running...");
    }
}

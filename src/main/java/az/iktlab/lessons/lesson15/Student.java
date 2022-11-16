package az.iktlab.lessons.lesson15;

public class Student extends Person implements Ability {

    @Override
    public void run() {
        System.out.println("Student is running...");
    }
}

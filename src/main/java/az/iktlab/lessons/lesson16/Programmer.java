package az.iktlab.lessons.lesson16;

public class Programmer extends Employee {

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void write() {
        System.out.println(getName() + " is programmer");
        System.out.println(getName() + " want to write some code");
    }
}

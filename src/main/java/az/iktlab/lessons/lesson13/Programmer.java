package az.iktlab.lessons.lesson13;

public class Programmer extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "bonus=" + bonus +
                "name=" + this.getName() +
                '}';
    }
}

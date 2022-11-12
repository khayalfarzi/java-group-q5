package az.iktlab.lessons.lesson13;

public class Employee extends Humann {
    private double salary;

    public Employee() {
    }

    public Employee(String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void write() {
        System.out.println("Employee is writing...");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}

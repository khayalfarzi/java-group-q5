package az.iktlab.lessons.lesson13;

public class Car {

    private double engine;
    private int doors;
    private String color;
    private String type;

    public Car() {
    }

    public Car(double engine, int doors, String color, String type) {
        this.engine = engine;
        this.doors = doors;
        this.color = color;
        this.type = type;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", doors=" + doors +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

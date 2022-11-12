package az.iktlab.lessons.lesson13;

public class Humann {
    private String name;
    private String surname;
    private int age;

    public Humann() {
    }

    public Humann(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void write() {
        System.out.println("Human is writing...");
    }

    @Override
    public String toString() {
        return "Humann{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

package az.iktlab.lessons.lesson11;

public class Person {
    public String name;
    public String surname;
    public int age;
    public String gender;

    public void setAge(int age) {
        if (age < 0)
            System.out.println("Yash 0 dan kicik ola bilmez");
        else this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
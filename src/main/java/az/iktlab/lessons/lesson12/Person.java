package az.iktlab.lessons.lesson12;

public class Person {

    public String name;
    public String surname;
    public int age;
    public String gender;

    public Person() {
        System.out.println("This is a constructor");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(int birthYear) {

        int currentYear = 2022;

        this.age = currentYear - birthYear;
    }

    public Person(String name, String surname, int birthYear, int genderIndex) {

        this.name = name;
        this.surname = surname;
        this.age = calculateAge(birthYear);
        this.gender = findGender(genderIndex);
    }

    public int calculateAge(int birthYear) {
        int currentYear = 2022;
        if (birthYear > currentYear) {
            System.out.println("Birth year can't be greater than current year !!!");
            return -1;
        } else
            return currentYear - birthYear;
    }

    public String findGender(int genderIndex) {
        if (genderIndex == 0)
            return "MALE";
        else if (genderIndex == 1)
            return "FEMALE";
        else System.out.println("Gender index is not found !!!");
        return null;
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

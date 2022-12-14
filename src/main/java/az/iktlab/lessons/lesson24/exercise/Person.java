package az.iktlab.lessons.lesson24.exercise;

public class Person extends Human implements Ability {

    private Person father;
    private Person mother;

    public Person(String name, String surname) {
        super(name, surname);
    }

    public Person(String name, String surname, int age,
                  Gender gender, Person father, Person mother) {
        super(name, surname, age, gender);
        this.father = father;
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    @Override
    public void write(String word) {
        System.out.println(word);
    }

    @Override
    public void read(String word) {
        System.out.println(word);
    }

    @Override
    public void sing(String word) {
        System.out.println(word);
    }

    @Override
    public void dance(String word) {
        System.out.println(word);
    }

    @Override
    public void run(String word) {
        System.out.println(word);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Person [ ");
        sb.append(String.format("father: {name: %s, surname: %s} , ", father.getName(), father.getSurname()));
        sb.append(String.format("mother: {name: %s, surname: %s} , ", mother.getName(), mother.getSurname()));
        sb.append(String.format("name: %s , ", getName()));
        sb.append(String.format("surname: %s , ", getSurname()));
        sb.append(String.format("age: %s , ", getAge()));
        sb.append(String.format("gender: %s", getGender()));
        sb.append(" ]");
        return sb.toString();
    }
}

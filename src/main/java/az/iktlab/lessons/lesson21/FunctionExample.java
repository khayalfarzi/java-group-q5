package az.iktlab.lessons.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionExample {

    private static final List<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        loadPeople();
        String s = "a";

        findPeopleByNameContainingChar(s);
    }

    private static void findPeopleByNameContainingCharFunctions(String s) {
        people.forEach(person -> {
            if (person.getName().toUpperCase().contains(s.toUpperCase()))
                System.out.println(person);
        });
    }

    private static void findPeopleByNameContainingCharFunctionsV2(String s) {
        Predicate<Person> containsFunc = person -> person.getName().toUpperCase().contains(s.toUpperCase());
        people.stream()
                .filter(containsFunc)
                .forEach(System.out::println);
    }

    private static void findPeopleByNameContainingChar(String s) {
        for (Person person : people) {
            if (person.getName().toUpperCase().contains(s.toUpperCase()))
                System.out.println(person);
        }
    }

    private static List<String> printNamesUsingFunc() {
        return people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
    }

    private static List<String> printNames() {
        List<String> names = new ArrayList<>();

        for (Person person : people) {
            names.add(person.getName());
        }

        return names;
    }

    private static void flatmapByFunc() {
         getNames().stream().flatMap(Collection::stream).forEach(System.out::println);
    }

    private static void flatmapByDedeBaba() {
        List<String> flat = new ArrayList<>();

        for (List<String> name : getNames()) {
            flat.addAll(name);
        }

        System.out.println(flat);
    }

    private static List<List<String>> getNames() {
        List<List<String>> names = new ArrayList<>();
        names.add(Arrays.asList("Ilkin", "Khayal", "Jafar"));
        names.add(Arrays.asList("Kanan", "Shahana", "Mehman"));
        names.add(Arrays.asList("Rashid", "Ali", "Ilham"));
        return names;
    }

    private static void loadPeople() {
        getPeople(people);
    }

    static void getPeople(List<Person> people) {
        people.add(new Person(1L, "Tofig", "Tofigzade", 23));
        people.add(new Person(2L, "Ilham", "Jafarov", 23));
        people.add(new Person(9L, "Jafar", "Jafarov", 23));
        people.add(new Person(3L, "Ali", "Aliyev", 23));
        people.add(new Person(4L, "Mehman", "Behbudov", 23));
        people.add(new Person(5L, "Kenan", "Haciyev", 23));
        people.add(new Person(6L, "Ilkin", "Ismayilov", 23));
        people.add(new Person(7L, "Shahana", "Loghmanzadeh", 23));
        people.add(new Person(8L, "Rashid", "Osmanli", 23));
    }
}

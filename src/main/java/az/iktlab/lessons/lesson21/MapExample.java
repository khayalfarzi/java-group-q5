package az.iktlab.lessons.lesson21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class MapExample {
    private static final List<Person> people = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static final Map<Long, Person> peopleMap = new HashMap<>();

    public static void main(String[] args) {
        loadPeople();
        loadPeopleToMap();

        System.out.print("Enter id for search: ");
        long id = sc.nextLong();

        // List way
        Person person = getByIdUsingList(id);
        System.out.println(person);

        // Map way
        Person personMap = getByIdUsingMap(id);
        System.out.println(personMap);
    }

    private static Person getByIdUsingList(Long id) {
        for (Person person : people) {
            if (Objects.equals(person.getId(), id))
                return person;
        }

        return new Person();
    }

    private static Person getByIdUsingMap(Long id) {
        return peopleMap.getOrDefault(id, new Person());
    }

    private static void loadPeople() {
        FunctionExample.getPeople(people);
    }

    private static void loadPeopleToMap() {
        for (Person person : people) peopleMap.put(person.getId(), person);
    }
}

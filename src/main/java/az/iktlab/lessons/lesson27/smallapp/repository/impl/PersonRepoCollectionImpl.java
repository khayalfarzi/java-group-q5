package az.iktlab.lessons.lesson27.smallapp.repository.impl;

import az.iktlab.lessons.lesson27.smallapp.model.Person;
import az.iktlab.lessons.lesson27.smallapp.repository.PersonRepository;

import java.util.*;

public class PersonRepoCollectionImpl implements PersonRepository {

    private static final Map<Long, Person> MAP = new HashMap<>();

    @Override
    public void save(Person person) {
        MAP.put(person.getId(), person);
    }

    @Override
    public List<Person> getAll() {
        return new ArrayList<>(MAP.values());
    }

    @Override
    public Person getById(Long id) {
        return MAP.get(id);
    }

    @Override
    public void delete(Person person) {
        MAP.remove(person.getId(), person);
    }

    @Override
    public void deleteById(Long id) {
        MAP.remove(id);
    }

    @Override
    public Long findMaxId() {
        return MAP.isEmpty() ? 0 : Collections.max(MAP.entrySet(), Map.Entry.comparingByKey()).getKey();
    }
}

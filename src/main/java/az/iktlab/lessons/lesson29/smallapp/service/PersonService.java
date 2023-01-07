package az.iktlab.lessons.lesson29.smallapp.service;

import az.iktlab.lessons.lesson29.smallapp.model.Person;
import az.iktlab.lessons.lesson29.smallapp.repository.PersonRepository;
import az.iktlab.lessons.lesson29.smallapp.repository.impl.PersonRepoCollectionImpl;

public class PersonService {

    private static final PersonRepository personRepository = new PersonRepoCollectionImpl();

    public void savePerson(Person person) {
        Long nextId = personRepository.findMaxId() + 1;
        person.setId(nextId);

        personRepository.save(person);
        System.out.println();
    }

    public void showPeople() {
        System.out.println();
        personRepository.getAll().forEach(System.out::println);
        System.out.println();
    }
}

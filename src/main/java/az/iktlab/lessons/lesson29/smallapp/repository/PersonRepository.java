package az.iktlab.lessons.lesson29.smallapp.repository;

import az.iktlab.lessons.lesson29.smallapp.model.Person;

public interface PersonRepository extends UniversalRepository<Person, Long> {

    Long findMaxId();
}

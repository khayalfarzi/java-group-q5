package az.iktlab.lessons.lesson27.smallapp.repository;

import az.iktlab.lessons.lesson27.smallapp.model.Person;

public interface PersonRepository extends UniversalRepository<Person, Long> {

    Long findMaxId();
}

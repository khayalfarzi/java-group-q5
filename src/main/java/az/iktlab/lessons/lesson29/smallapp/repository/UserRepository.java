package az.iktlab.lessons.lesson29.smallapp.repository;

import az.iktlab.lessons.lesson29.smallapp.model.User;

public interface UserRepository extends UniversalRepository<User, Long> {
    Long findMaxId();

}

package az.iktlab.lessons.lesson27.smallapp.service;

import az.iktlab.lessons.lesson27.smallapp.model.Person;
import az.iktlab.lessons.lesson27.smallapp.model.User;
import az.iktlab.lessons.lesson27.smallapp.repository.PersonRepository;
import az.iktlab.lessons.lesson27.smallapp.repository.UserRepository;
import az.iktlab.lessons.lesson27.smallapp.repository.impl.PersonRepoCollectionImpl;
import az.iktlab.lessons.lesson27.smallapp.repository.impl.UserRepoCollectionImpl;

import java.util.Optional;
import java.util.stream.Collectors;

public class UserService {

    private static final UserRepository userRepo = new UserRepoCollectionImpl();
    private static final PersonRepository personRepo = new PersonRepoCollectionImpl();

    public void registerUser(User user, Long personId) {
        Long nextId = userRepo.findMaxId() + 1;
        user.setId(nextId);

        checkUsername(user);

        Person person = getPerson(personId);

        user.setPerson(person);

        userRepo.save(user);

        System.out.println("=========================");

        System.out.println(userRepo.getAll());
    }

    private Person getPerson(Long id) {
        return Optional.of(personRepo.getById(id))
                .orElseThrow(() -> new RuntimeException("PERSON ID NOT FOUND !!!"));
    }

    private void checkUsername(User user) {
        if (usernameContains(user.getUsername())) {
            throw new RuntimeException("USER ALREADY EXIST !!!");
        }
    }

    private boolean usernameContains(String username) {
        return userRepo.getAll()
                .stream()
                .map(User::getUsername)
                .collect(Collectors.toList())
                .contains(username);
    }
}

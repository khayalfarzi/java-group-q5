package az.iktlab.lessons.lesson27.smallapp.repository.impl;

import az.iktlab.lessons.lesson27.smallapp.model.User;
import az.iktlab.lessons.lesson27.smallapp.repository.UserRepository;

import java.util.*;

public class UserRepoCollectionImpl implements UserRepository {

    private static final Map<Long, User> map = new HashMap<>();

    @Override
    public void save(User user) {
        map.put(user.getId(), user);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public User getById(Long id) {
        return map.get(id);
    }

    @Override
    public void delete(User user) {
        map.remove(user.getId(), user);
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }

    @Override
    public Long findMaxId() {
        return map.isEmpty() ? 0 : Collections.max(map.entrySet(), Map.Entry.comparingByKey()).getKey();
    }
}

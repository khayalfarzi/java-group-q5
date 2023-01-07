package az.iktlab.lessons.lesson29.smallapp.repository;

import java.util.List;

public interface UniversalRepository<T, ID> {

    void save(T t);

    List<T> getAll();

    T getById(ID id);

    void delete(T t);

    void deleteById(ID id);
}

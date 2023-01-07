package az.iktlab.lessons.lesson29.smallapp.repository.impl;

import az.iktlab.lessons.lesson29.smallapp.model.Person;
import az.iktlab.lessons.lesson29.smallapp.model.Sql;
import az.iktlab.lessons.lesson29.smallapp.repository.PersonRepository;

import java.sql.*;
import java.util.List;

public class PersonRepoJdbcImpl implements PersonRepository {

    private final Statement stmt;

    public PersonRepoJdbcImpl() {
        try {
            Connection con = DriverManager.getConnection("url", "user", "pass");
            this.stmt = con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Long findMaxId() {

        try {
            ResultSet rs = stmt.executeQuery(Sql.FIND_MAX_ID.getValue());

            return rs.getLong("max_id");
        } catch (SQLException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public Person getById(Long aLong) {
        return null;
    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}

package javaProject.dataAccess.abstracts;

import javaProject.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void uptade(User user);
    List<User> getAll();

}

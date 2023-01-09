package org.example.pp.dao;

import org.example.pp.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findUserById(Long id);
    void save(User user);
    void update(User updatedUser);
    void delete(Long id);
    User findByEmail(String email);
}

package org.example.pp.service;

import org.example.pp.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    User findUserById(Long id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUserById(Long id);
    void updateUser(User user);
    UserDetails loadUserByUsername(String email);
}

package org.example.pp.dao;

import org.example.pp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public List<User> findAll() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    public User findUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    public void save(User user) {
        entityManager.persist(user);
    }

    public void update(User updatedUser) {
        entityManager.merge(updatedUser);
    }

    public void delete(Long id) {
        User user = findUserById(id);
        entityManager.remove(user);
    }

    public User findByEmail(String email) {
        return entityManager.createQuery("SELECT u FROM User u JOIN FETCH u.roles roles where u.email = :email ", User.class).setParameter("email", email).getSingleResult();
    }
}

package org.example.pp.dao;

import org.example.pp.model.Role;
import org.example.pp.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    public List<Role> findAll() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    public Role findRoleByName(String name) {
        return entityManager.createQuery("SELECT r FROM Role r where r.name = :name", Role.class).setParameter("name", name).getSingleResult();
    }

    public Role findRoleById(Long id) {
        return entityManager.find(Role.class, id);
    }

    public void save(Role role) {
        entityManager.persist(role);
    }

    public void update(Role updatedRole) {
        entityManager.merge(updatedRole);
    }

    public void delete(Long id) {
        Role role = findRoleById(id);
        entityManager.remove(role);
    }
}

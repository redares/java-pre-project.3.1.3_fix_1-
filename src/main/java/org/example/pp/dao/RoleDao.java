package org.example.pp.dao;

import org.example.pp.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> findAll();
    Role findRoleByName(String name);
    Role findRoleById(Long id);
    void save(Role role);
    void update(Role updatedRole);
    void delete(Long id);
}

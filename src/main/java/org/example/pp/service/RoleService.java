package org.example.pp.service;

import org.example.pp.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getRole(String name);
}

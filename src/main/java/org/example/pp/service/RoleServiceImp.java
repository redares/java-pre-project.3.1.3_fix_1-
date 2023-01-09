package org.example.pp.service;

import org.example.pp.dao.RoleDao;
import org.example.pp.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImp implements RoleService{

    private final RoleDao roleDao;
    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> getAllRoles() {
        return roleDao.findAll();
    }

    public Role getRole(String name) {
        return roleDao.findRoleByName(name);
    }
}

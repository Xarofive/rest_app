package com.restapp.service;

import com.restapp.dao.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapp.model.Role;

import java.util.List;

@Service
public class RoleServiceImpl {
    @Autowired
    RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleByName(String name) {
        return roleRepository.findByRole(name);
    }

}

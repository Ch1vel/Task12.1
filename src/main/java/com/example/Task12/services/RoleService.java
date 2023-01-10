package com.example.Task12.services;

import com.example.Task12.models.Role;
import com.example.Task12.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleServiceInterface {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> showRoles() {
        return roleRepository.findAll();
    }
}

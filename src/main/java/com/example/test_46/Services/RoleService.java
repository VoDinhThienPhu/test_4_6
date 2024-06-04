package com.example.test_46.Services;

import com.example.test_46.Entities.Role;
import com.example.test_46.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public void addRole(Role role) {
        roleRepository.save(role);
    }
}

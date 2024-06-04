package com.example.test_46.Controllers;

import com.example.test_46.Entities.Role;
import com.example.test_46.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private RoleService roleServices;
    @GetMapping("")
    public String getRoles(Model model) {
        List<Role> roles = roleServices.getAllRoles();
        model.addAttribute("roles", roles);
        return "Role/GetAll";
    }
    @GetMapping("/new")
    public String AddRole(Model model) {
        model.addAttribute("roles", new Role());
        return "Role/add";
    }
    @PostMapping("/save")
    public String SaveRole(Role role) {
        roleServices.addRole(role);
        return "redirect:/roles";
    }
}

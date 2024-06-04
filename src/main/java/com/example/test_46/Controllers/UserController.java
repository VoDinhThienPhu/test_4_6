package com.example.test_46.Controllers;

import com.example.test_46.Entities.User;
import com.example.test_46.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public String getAllUsers(Model model) {
        List<User> users = userService.GetAllUser();
        model.addAttribute("users", users);
        return "User/getAll";
    }
    @GetMapping("/new")
    public String addUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "User/add";
    }
    @PostMapping("/save")
    public String saveUser(Model model, User user) {
        userService.createUser(user);
        return "redirect:/users";
    }
}

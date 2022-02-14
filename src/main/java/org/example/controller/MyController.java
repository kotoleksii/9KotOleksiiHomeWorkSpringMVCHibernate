package org.example.controller;

import org.example.entity.Number;
import org.example.entity.User;
import org.example.service.NumberService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;
    @Autowired
    private NumberService numberService;

    @RequestMapping("/")
    public String showAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        List<Number> numbers = numberService.getAllNumbers();
        model.addAttribute("users", users);
        model.addAttribute("numbers", numbers);
        return "all-users";
    }
}

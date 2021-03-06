package org.example.controller;

import org.example.entity.Number;
import org.example.entity.User;
import org.example.service.NumberService;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UserService userService;
    @Autowired
    private NumberService numberService;

    @RequestMapping("/")
    public String showMainPage() {
        return "main";
    }

    @RequestMapping("/showAll")
    public String showAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        List<Number> numbers = numberService.getAllNumbers();

        model.addAttribute("users", users);
        model.addAttribute("numbers", numbers);
        return "show-all";
    }

    @RequestMapping("/addNewContact")
    public String addNewUser(Model model) {
        User user = new User();
        Number number = new Number();
        model.addAttribute("user", user);
        model.addAttribute("number", number.getPhone());
        return "contact-info";
    }

    @RequestMapping("/saveContact")
    public String saveUser(@ModelAttribute("user") User user, @ModelAttribute("number") Number number) {
        userService.saveUser(user);
        numberService.saveNumber(number);
        return "redirect:/";
    }
}

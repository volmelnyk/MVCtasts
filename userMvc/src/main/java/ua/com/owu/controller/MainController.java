package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;
import ua.com.owu.service.impl.UserServiceIml;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home( Model model) {

        List<User> all = userService.findAll();
        model.addAttribute("list",all);
        return "index";
    }

    @PostMapping("/save")
    public String SaveContoller(@RequestParam("name") String name, @RequestParam("age") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.save(user);
        return "redirect:/";
    }
}

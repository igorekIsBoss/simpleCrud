package ru.company.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.company.my.repository.UserRepository;

/**
 * Created by igor on 14.12.16.
 */
@Controller
public class CrudController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/showUsers")
    public String showUsers(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "listUser";
    }
}

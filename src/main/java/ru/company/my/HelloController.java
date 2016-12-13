package ru.company.my;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by igor on 13.12.16.
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required = false, defaultValue = "world") String name) {
        model.addAttribute("name", "Igor");
        return "hello";
    }
}

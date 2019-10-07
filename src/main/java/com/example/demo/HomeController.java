package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage (Model model){
        model.addAttribute("myvar", "say hello to the people.");
        model.addAttribute("myvar2", "This is Mel from Spring Boot!");
        return "hometemplate";
    }
}

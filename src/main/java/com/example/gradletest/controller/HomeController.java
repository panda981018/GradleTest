package com.example.gradletest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String welcome(Model model) {

        model.addAttribute("message", "Welcome to my page!");

        return "index";
    }

}

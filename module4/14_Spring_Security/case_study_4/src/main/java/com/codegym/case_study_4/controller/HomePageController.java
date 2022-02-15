package com.codegym.case_study_4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = "/")
    public String showHomePage() {
        return "homepage";
    }

    @GetMapping(value = "/login")
    public String showLogin() {
        return "login";
    }

    @GetMapping(value = "/403")
    public String showException() {
        return "403";
    }
}

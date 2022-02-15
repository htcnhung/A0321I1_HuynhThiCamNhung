package com.codegym.internationalblog.controller;

import com.codegym.internationalblog.reponse.User;
import com.codegym.internationalblog.request.Credential;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("credential", new Credential());
        return "login";
    }

    @PostMapping("/login")
    public String dashboard(@ModelAttribute("credential") Credential credential, Model model) {
        User user = new User();
        user.setUserName(credential.getUserName());
        model.addAttribute("user", user);
        return "dashboard";
    }
}

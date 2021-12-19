package com.codegym.bai_tap.controller;

import com.codegym.bai_tap.model.User;
import com.codegym.bai_tap.service.UserRepository;
import com.codegym.bai_tap.validator.FormValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class FormController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("user", new User());
        return "user/create";
    }

    @PostMapping("/")
    public String checkValidation(@Validated @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        new FormValidator().validate(user, bindingResult);
        if (bindingResult.hasErrors()) {
            return "index";
        } else {
            userRepository.save(user);
            model.addAttribute("user", userRepository.getUserById(1));
            return "result";
        }
    }
}

package com.codegym.controller;

import com.codegym.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/setting")
public class MailBoxController {

    @GetMapping(value = {"", "/show"})
    public String showForm(Model model) {
        List<String> languageList = new ArrayList<>();
        List<Integer> pageSizeList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);
        model.addAttribute("languageList", languageList);
        model.addAttribute("pageSizeList", pageSizeList);
        model.addAttribute("mailbox", new MailBox());
        return "mailbox/form";
    }

    @PostMapping("/addMailBox")
    public String submit(@ModelAttribute("mailbox") MailBox mailBox, BindingResult bindingResult, ModelMap model) {
        model.addAttribute("languageList", mailBox.getLanguages());
        model.addAttribute("pageSizeList", mailBox.getPageSize());
        model.addAttribute("spamFilter", mailBox.getSpamFilter());
        model.addAttribute("signature", mailBox.getSignature());
        return "mailbox/info";
    }


}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloClass {
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name, Model model){
        model.addAttribute("name", name);
     return "hello";
    }
}

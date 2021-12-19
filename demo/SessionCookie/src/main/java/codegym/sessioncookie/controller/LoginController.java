package codegym.sessioncookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }


    @PostMapping("/login")
    public String doLogin(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          HttpSession httpSession,
                          Model model) {
        if ("Linh".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)) {
            httpSession.setAttribute("user", "Linh");
            httpSession.setMaxInactiveInterval(200);
            return "redirect:index";
        }
        model.addAttribute("message", "Sai username hoặc password");
        return "login";
    }
}

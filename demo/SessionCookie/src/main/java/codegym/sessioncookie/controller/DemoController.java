package codegym.sessioncookie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("user")
public class DemoController {
    @ModelAttribute("user")
    public String getUser() {
        return new String();
    }

    @GetMapping("/index")
    public String index(@CookieValue(name = "hitCounter", defaultValue = "0") Long count,
                        @ModelAttribute(name = "user", value = "") String user,
                        Model model, HttpServletResponse response) {
        if (user == null || user.isEmpty()) {
            return "redirect:login";
        }

        count++;
        Cookie cookie = new Cookie("hitCounter", count.toString());
        response.addCookie(cookie);
        model.addAttribute("count", count);
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/delete")
    public String deleteCookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("hitCounter", "0");
        cookie.setMaxAge(5);
        response.addCookie(cookie);
        return "index";
    }
}

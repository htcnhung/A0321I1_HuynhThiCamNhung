package controller;

import models.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryServiceImpl;

import java.util.List;

@Controller
public class TranslateController {
    private DictionaryServiceImpl dictionaryService = new DictionaryServiceImpl();

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model) {
        List<Dictionary> dictionaries = this.dictionaryService.findAll();
        for (int i = 0; i < dictionaries.size(); i++) {
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEn())) {
                model.addAttribute("word", dictionaries.get(i).getVi());
                model.addAttribute("key", keyword);
                model.addAttribute("message", "exist");
                return "search";
            }
        }
        model.addAttribute("key", keyword);
        model.addAttribute("message", "Sorry, we not found " +'"'+ keyword+'"'+ " in dictionary!");
        return "search";
    }

}

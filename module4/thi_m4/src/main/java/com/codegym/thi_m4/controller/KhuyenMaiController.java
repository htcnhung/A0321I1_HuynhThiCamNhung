package com.codegym.thi_m4.controller;

import com.codegym.thi_m4.model.KhuyenMai;
import com.codegym.thi_m4.service.KhuyenMaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/khuyenmai")
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

        @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @ModelAttribute("khuyenmais")
    public Iterable<KhuyenMai> listQuestion() {
        return khuyenMaiService.findAll();
    }

    @ModelAttribute("khuyenmai")
    public KhuyenMai question() {
        return new KhuyenMai();
    }

    @GetMapping(value = {"", "/list"})
    public String showList(Model model, Pageable pageable) {
        model.addAttribute("khuyenmais", khuyenMaiService.findAll());
        return "/khuyenmais/list";
    }

    @PostMapping("/create-khuyenmai")
    public String createKhuyenMai(@Validated @ModelAttribute KhuyenMai khuyenMai, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model, Pageable pageable) {
        if (bindingResult.hasErrors()) {
//            Iterable<KhuyenMai> khuyenmais = khuyenMaiService.findAll();
//            model.addAttribute("khuyenmais", khuyenmais);
            model.addAttribute("check", false);
            return "/khuyenmais/list";
        } else {
            khuyenMaiService.save(khuyenMai);
            redirectAttributes.addFlashAttribute("message", "Thêm mới khuyến mãi thành công!");
            return "redirect:/khuyenmai/list";
        }

    }

    @GetMapping("/view/{id}")
    public String viewKhuyenMai(@PathVariable int id, Model model) {
        KhuyenMai khuyenMai = khuyenMaiService.findById(id);
        model.addAttribute("khuyenmai", khuyenMai);
        return "/khuyenmais/view";
    }

    @GetMapping("/delete-khuyenmai/{id}")
    public String showCreate(@PathVariable int id) {
        khuyenMaiService.remove(id);
        return "redirect:/khuyenmai/list";
    }

    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model) {
        KhuyenMai khuyenMai = khuyenMaiService.findById(id);
        Iterable<KhuyenMai> khuyenmais = khuyenMaiService.findAll();
        model.addAttribute("khuyenmais", khuyenmais);
        model.addAttribute("khuyenmai", khuyenMai);
        return "/khuyenmais/edit";
    }

    @PostMapping("/edit")
    public String editQuestion(@Validated @ModelAttribute KhuyenMai khuyenMai, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            Iterable<KhuyenMai> khuyenmais = khuyenMaiService.findAll();
            model.addAttribute("khuyenmais", khuyenmais);
            model.addAttribute("khuyenmai", khuyenMai);
            return "/khuyenmais/edit";
        } else {
            khuyenMaiService.save(khuyenMai);
            redirectAttributes.addFlashAttribute("message", "Edit Khuyến mãi thành công");
            return "redirect:/khuyenmai/list";
        }
    }

    @GetMapping("/search-title")
    public ModelAndView searchByText(@RequestParam String inputSearch) {
        return new ModelAndView("/khuyenmais/list", "khuyenmais", khuyenMaiService.findByTitle(inputSearch));
    }

}

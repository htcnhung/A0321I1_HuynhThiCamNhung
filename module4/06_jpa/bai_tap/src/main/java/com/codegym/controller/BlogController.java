package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping(value = {"", "/"})
        public String showList(Model model) {
//        Pageable pageable = PageRequest.of(1, 5);
        model.addAttribute("blogList", blogService.findAll());
        return "blogs/list";
    }

    @GetMapping(value = "/create")
    public String showCreate(Blog blog, Model model) {
        model.addAttribute("blog", blog);
        return "blogs/create";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Long id, Model model) {
        Blog blog = blogService.findOne(id);
        model.addAttribute("blog", blog);
        return "blogs/edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping(value = "/delete/{id}")
    public String showDelete(@PathVariable("id") Long id, Model model) {
        Blog blog = blogService.findOne(id);
        model.addAttribute("blog", blog);
        return "blogs/delete";
    }

    @PostMapping(value = "/actionDelete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        blogService.delete(id);
        Pageable pageable = PageRequest.of(1, 5);
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogList", blogList);
        return "blogs/search";
    }

    @GetMapping(value = "/search")
    public String searchByContent(@RequestParam(value = "search", required = false) String search, Model model, Pageable pageable) {
        //required: là false nghĩa là có thể có hoặc không
//        if (search != null && !search.equals("")) {
//            Page<Blog> blogList = blogService.findByContentContaining(search, pageable);
//        } else {
            List<Blog> blogList =  blogService.findAll();
//        }
        model.addAttribute("blogList", blogList);
        return "blogs/search";


    }

}

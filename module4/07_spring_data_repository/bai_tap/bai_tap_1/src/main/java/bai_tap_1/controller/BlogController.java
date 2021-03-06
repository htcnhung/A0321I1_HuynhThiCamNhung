package bai_tap_1.controller;

import bai_tap_1.model.Blog;
import bai_tap_1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping(value = {"", "/"})
    public String showList(@PageableDefault(size = 3) Pageable pageable, Model model) {
        model.addAttribute("blogList", blogService.findAll(pageable));
        return "blog/list";
    }

    @GetMapping(value = "/create")
    public String showCreate(Blog blog, Model model) {
        model.addAttribute("blog", blog);
        return "blog/create";
    }

    @PostMapping(value = "create")
    public String create(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "redirect:/blog/";
    }

    @GetMapping(value = "/edit/{id}")
    public String showEdit(@PathVariable("id") Long id, Model model) {
        Blog blog = blogService.findOne(id);
        model.addAttribute("blog", blog);
        blogService.save(blog);
        return "blog/edit";
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
        return "blog/delete";
    }

    @PostMapping(value = "/actionDelete")
    public String delete( @ModelAttribute("blog") Blog blog) {
        blogService.delete(blog.getId());
        return "redirect:/blog/";
    }

    @GetMapping(value = "/search")
    public String searchByContent(@RequestParam(value = "search", required = false) String search, Model model, Pageable pageable) {
        Page<Blog> blogList;
        if (search != null && !search.equals("")) {
            blogList = blogService.findByContentContaining(search, pageable);
        } else {
            blogList = blogService.findAll(pageable);
        }
        model.addAttribute("blogList", blogList);
        return "blog/search";
    }
}

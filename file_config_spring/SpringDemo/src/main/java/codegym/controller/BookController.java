package codegym.controller;

import codegym.model.Book;
import codegym.model.Student;
import codegym.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("create")
    public String displayCreate(Model model) {
        model.addAttribute("book", new Book());
        return "book/create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute("book") Book book, Model model) {
        bookService.save(book);
        return "redirect:/book/list";
    }

    @GetMapping("list")
    public String listStudent(Model model) {
        model.addAttribute("books", bookService.getList());
        return "book/list";
    }
}

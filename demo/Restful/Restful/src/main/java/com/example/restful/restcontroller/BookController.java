package com.example.restful.restcontroller;

import com.example.restful.entity.Book;
import com.example.restful.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/api/book/create")
    public ResponseEntity<Void> createBook(@RequestBody Book book, UriComponentsBuilder ucBuilder) {
        bookService.save(book);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/book/{id}").buildAndExpand(book.getBookId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @GetMapping("/api/book/list")
    public ResponseEntity<List<Book>> getListBook() {
        List<Book> books = bookService.getList();
        return new ResponseEntity<List<Book>>(books, HttpStatus.OK);
    }

    @GetMapping("/api/book/{id}")
    public ResponseEntity<Book> getDetailBook(@PathVariable(name = "id") Book book) {
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

}

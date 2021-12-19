package com.codegym.bai_tap.service;

import com.codegym.bai_tap.model.Book;

public interface BookService {
    Iterable<Book> findAll();

    Book findById(Long id);

    void save(Book book);

    void remove(Long id);
}

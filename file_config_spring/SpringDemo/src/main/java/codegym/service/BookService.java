package codegym.service;

import codegym.model.Book;

import java.util.List;

public interface BookService {
    Book getBookById(int id);
    List<Book> getList();
    void save(Book book);
    void update(Book book);
    void deleteBookById(int id);
}

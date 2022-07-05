package com.demodynamicproxy.book.service;

import com.demodynamicproxy.Service;
import com.demodynamicproxy.book.entity.Book;

import java.util.List;

public interface BookService extends Service {
    void getBookById(long id);

    List<Book> getBooks();

    Book addBook(Book book);

    boolean deleteBook(long bookId);
}

package com.demodynamicproxy.book.service;

import com.demodynamicproxy.book.entity.Book;
import com.demodynamicproxy.book.service.BookService;

import java.util.List;

public class DefaultBookService implements BookService{
    @Override
    public void getBookById(long id) {
        System.out.println(String.format("Found Book with Id = %s", id));
    }

    @Override
    public List<Book> getBooks() {
        System.out.println("Querying to get all books");
        return List.of();
    }

    @Override
    public Book addBook(Book book) {
        System.out.println("Book added");
        return new Book();
    }

    @Override
    public boolean deleteBook(long bookId) {
        // Implementation details
        System.out.println(String.format("Book %s deleted", bookId));
        return true;
    }
}

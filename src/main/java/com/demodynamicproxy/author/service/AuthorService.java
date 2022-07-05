package com.demodynamicproxy.author.service;

import com.demodynamicproxy.Service;
import com.demodynamicproxy.author.entity.Author;

import java.util.List;

public interface AuthorService extends Service {
    List<Author> getAllAuthors();

    Author addAuthor(Author author);
}

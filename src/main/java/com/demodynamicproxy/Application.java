package com.demodynamicproxy;

import com.demodynamicproxy.author.entity.Author;
import com.demodynamicproxy.author.service.AuthorService;
import com.demodynamicproxy.author.service.DefaultAuthorService;
import com.demodynamicproxy.book.service.BookService;
import com.demodynamicproxy.book.service.DefaultBookService;
import com.demodynamicproxy.library.service.DefaultLibraryService;
import com.demodynamicproxy.library.service.LibraryService;
import com.demodynamicproxy.proxy.MethodExecutorLogger;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args){
        // Get proxy of author service
        AuthorService authorServiceProxy =Proxy.newProxyInstance(new DefaultAuthorService(), AuthorService.class);
        authorServiceProxy.addAuthor(new Author());

        // Get proxy of book service
        BookService bookServiceProxy = getProxyOf(new DefaultBookService(), BookService.class);
        bookServiceProxy.getBooks();

        // Get proxy of library service
        LibraryService libraryServiceProxy = getProxyOf(new DefaultLibraryService(), LibraryService.class);
        libraryServiceProxy.searchForLibraryByLatitudeLongitude(10, 20);
    }
}

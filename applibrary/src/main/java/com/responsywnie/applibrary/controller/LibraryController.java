package com.responsywnie.applibrary.controller;

import com.responsywnie.applibrary.entity.Book;
import com.responsywnie.applibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        throw new IllegalArgumentException("Not implemented yet");
    }
    @GetMapping("/books/{id}")
    public Book getOneBook(@PathVariable long id){
        throw new IllegalArgumentException("Not implemented yet");
    }
}

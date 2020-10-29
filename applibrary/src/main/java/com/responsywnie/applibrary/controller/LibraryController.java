package com.responsywnie.applibrary.controller;

import com.responsywnie.applibrary.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LibraryController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return getAllBooks();
    }
}

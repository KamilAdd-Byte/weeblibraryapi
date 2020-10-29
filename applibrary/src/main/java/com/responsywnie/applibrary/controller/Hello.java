package com.responsywnie.applibrary.controller;

import com.responsywnie.applibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    BookService bookService;

    @GetMapping("/")
    public String hello(){
      return bookService.hello();
    }
}

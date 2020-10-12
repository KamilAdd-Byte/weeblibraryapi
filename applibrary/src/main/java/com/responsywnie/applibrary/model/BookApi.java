package com.responsywnie.applibrary.model;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/library")
public class BookApi {

    private List<Book>bookList;

    private BookApi (){
        bookList = new ArrayList<>();
        bookList.add(new Book("Javax","Java",2,1L));
    }

    @GetMapping("/all")
    private List<Book> getAll (){
        return bookList;
    }

    @GetMapping
    private Book findByID(@RequestParam int index){
        Optional<Book> first = bookList.stream()
                .filter(element -> element.getId() == index).findFirst();
        return first.get();
    }
    @PostMapping//dodaje
    private boolean addBooks (@RequestBody Book book){
        return bookList.add(book);
    }
    @PutMapping//modyfikuje
    private boolean modifiedBooks(@RequestBody Book book){
        return bookList.add(book);
    }
    @DeleteMapping//usuwa
    private boolean deletedBooks(@RequestParam int index){
        return bookList.removeIf(element -> element.getId() == index);
    }
}

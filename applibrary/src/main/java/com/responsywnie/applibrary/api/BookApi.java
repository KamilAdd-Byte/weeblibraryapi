package com.responsywnie.applibrary.api;

import com.responsywnie.applibrary.entity.Book;
import com.responsywnie.applibrary.menager.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/library")
public class BookApi {

    private BookManager books;

    @Autowired
    public BookApi(BookManager bookManager) {
        this.books = bookManager;
    }

    @GetMapping("/all")
    private Iterable<Book> getAll (){
        return books.findAllBook();
    }

    @GetMapping
    private Optional<Book> findByID(@RequestParam Long index){
        return books.findBookById(index);
    }
    @PostMapping//dodaje
    private Book addBooks (@RequestBody Book book){
        return books.saveBookInDatabase(book);
    }
    @PutMapping//modyfikuje
    private Book modifiedBooks(@RequestBody Book book){
        return books.saveBookInDatabase(book);
    }
    @DeleteMapping//usuwa
    private void deletedBooks(@RequestParam Long index){
        books.deleteBookInDatabase(index);
    }
}

package com.responsywnie.applibrary.menager;

import com.responsywnie.applibrary.dao.BookRepo;
import com.responsywnie.applibrary.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookManager {//Warstwa pośrednia między dostępem do danych a API

    private BookRepo bookRepo;//pole repozytorium,dane

    @Autowired
    public BookManager(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Optional<Book> findById(Long id) {//typ zwracany Optional. Metoda szuka po id.
        return bookRepo.findById(id);
    }

    public Iterable<Book> findAll(Long id) {//typ zwracany Optional
        return bookRepo.findAll();
    }

    public Book saveBook(Book book) {//pozwala zapisywać
        return bookRepo.save(book);

    }
}
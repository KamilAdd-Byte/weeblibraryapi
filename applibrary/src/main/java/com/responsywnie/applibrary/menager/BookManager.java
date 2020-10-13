package com.responsywnie.applibrary.menager;

import com.responsywnie.applibrary.dao.BookRepo;
import com.responsywnie.applibrary.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookManager {//Warstwa pośrednia między dostępem do danych a API

    private BookRepo bookRepo;//pole repozytorium,dane

    @Autowired
    public BookManager(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public Optional<Book> findBookById(Long id) {//typ zwracany Optional. Metoda szuka po id.
        return bookRepo.findById(id);
    }

    public Iterable<Book> findAllBook() {//typ zwracany Optional
        return bookRepo.findAll();
    }

    public Book saveBookInDatabase(Book book) {//pozwala zapisywać
        return bookRepo.save(book);

    }


    public void deleteBookInDatabase(Long id){//usuwa z bazy typ void
        bookRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)//dodanie do bazy poprzez METODĘ
    public void fillDB(){
        saveBookInDatabase(new Book("Javax","Java",2,1L));
        saveBookInDatabase(new Book("Pedagogika.Podręcznik Akademicki","Znany",3,3L));
        saveBookInDatabase(new Book("Język MySql","Java",1,2L));
    }
}
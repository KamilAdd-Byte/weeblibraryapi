package com.responsywnie.applibrary.dao;

import com.responsywnie.applibrary.entity.Book;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface BookDAO{

    List<Book> books = new ArrayList<>();

    void save(Book book);

    Book getBook(long id);
}

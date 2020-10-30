package com.responsywnie.applibrary.service;

import com.responsywnie.applibrary.dao.BookDAO;
import com.responsywnie.applibrary.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    BookDAO bookDAO;

    @Override
    public void saveBook(Book book) {
      bookDAO.save(book);
    }
}

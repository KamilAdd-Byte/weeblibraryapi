package com.responsywnie.applibrary.service;

import com.responsywnie.applibrary.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface BookService  {

List<Book>bookList=new ArrayList<>();

void saveBook(Book book);

Book getBook(long id);
}

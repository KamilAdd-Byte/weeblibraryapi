package com.responsywnie.applibrary.service;

import com.responsywnie.applibrary.dao.BookDAO;
import org.springframework.stereotype.Service;


@Service
public class BookService implements BookDAO {

 public String hello(){
     return "Hello controller";
 }
}

package com.responsywnie.applibrary.dao;


import com.responsywnie.applibrary.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<Book,Long> {
}
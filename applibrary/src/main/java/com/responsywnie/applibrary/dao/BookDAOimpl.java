package com.responsywnie.applibrary.dao;

import com.responsywnie.applibrary.entity.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Repository
public class BookDAOimpl implements BookDAO {

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public void save(Book book) {
        entityManager.persist(book);
    }
}

package com.responsywnie.applibrary.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@Getter
@Setter
@ToString
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "isbn",nullable = true)
    private int isbn;

    private String title;
    private String author;
    private int localization;

    public Book() {
    }

    public Book(Long id, int isbn, String title, String author, int localization) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.localization = localization;
    }
}

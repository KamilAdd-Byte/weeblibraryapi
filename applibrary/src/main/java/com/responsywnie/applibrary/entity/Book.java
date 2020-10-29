package com.responsywnie.applibrary.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn &&
                localization == book.localization &&
                id.equals(book.id) &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isbn, title, author, localization);
    }
}

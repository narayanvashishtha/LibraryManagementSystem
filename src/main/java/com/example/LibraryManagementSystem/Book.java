package com.example.LibraryManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book_table")
public class Book {

    @Id
    private int id;
    private String name;
    private int pages;
    private String author;

    public Book(int id, String name, int pages, String author) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
    }
    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

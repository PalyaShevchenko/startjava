package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private String publication; //год издания

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getPublication() {
        return publication;
    }
}

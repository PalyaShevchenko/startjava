package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear; //год издания

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String toSting() {
        return author + ", " + title + ", " + publishYear;
    }
}

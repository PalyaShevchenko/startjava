package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;
    private int lengthBook;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        lengthBook = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthBook() {
        return lengthBook;
    }

    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}

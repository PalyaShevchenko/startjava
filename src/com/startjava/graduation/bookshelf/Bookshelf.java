package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static int BOOKSHELF_SIZE = 10;
    private int numBooks;
    private final Book[] books = new Book[BOOKSHELF_SIZE];
    private int maxLengthBook;

    public int getNumBooks() {
        return numBooks;
    }

    public int getFreeSize() {
        return BOOKSHELF_SIZE - numBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, numBooks);
    }

    public Book getBook(int index) {
        return books[index];
    }

    public int getMaxLengthBook() {
        return maxLengthBook;
    }

    public void addBook(String author, String title, int year) {
        books[numBooks] = new Book(title);
        books[numBooks].setAuthor(author);
        books[numBooks].setPublishYear(year);
        int lengthBook = books[numBooks].toSting().length();
        if (lengthBook > maxLengthBook) {
            maxLengthBook = lengthBook;
        }
        numBooks++;
    }

    public int findBook(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        System.out.println("книга \"" + title + "\" не найдена");
        return -1;
    }

    public void deleteBook(String title) {
        int index = findBook(title);
        if (index != -1) {
            boolean isLongestBook = maxLengthBook == books[index].toSting().length();
            for (int i = index; i < numBooks - 1; i++) {
                books[i] = books[i+1];
            }
            numBooks--;
            if (isLongestBook) {
                maxLengthBook = 0;
                int temp;
                for (int i = 0; i < numBooks; i++) {
                    temp = books[i].toSting().length();
                    if (maxLengthBook < temp) {
                        maxLengthBook = temp;
                    }
                }
            }
        }
    }

    public void clear() {
        numBooks = 0;
    }
}

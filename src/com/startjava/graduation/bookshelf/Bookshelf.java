package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static int BOOKSHELF_SIZE = 10;
    private int numBooks;
    private Book[] books = new Book[BOOKSHELF_SIZE];
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

    public Book getBook(String title) {
        int index = findIndex(title);
        if (index != -1) {
            return books[index];
        }
        return null;
    }

    public int getMaxLengthBook() {
        return maxLengthBook;
    }

    public void addBook(Book book) {
        books[numBooks] = book;
        if (book.getLengthBook() > maxLengthBook) {
            maxLengthBook = book.getLengthBook();
        }
        numBooks++;
    }

    public void deleteBook(String title) {
        int index = findIndex(title);
        if (index != -1) {
            boolean isLongestBook = maxLengthBook == books[index].getLengthBook();
            for (int i = index; i < numBooks - 1; i++) {
                books[i] = books[i+1];
            }
            numBooks--;
            if (isLongestBook) {
                maxLengthBook = 0;
                for (Book book : getBooks()) {
                    if (maxLengthBook < book.getLengthBook()) {
                        maxLengthBook = book.getLengthBook();
                    }
                }
            }
        } else {
            System.out.println("Книга \"" + title + "\" не найдена");
        }
    }

    public void clear() {
        Arrays.fill(books, null);
        numBooks = 0;
    }

    private int findIndex(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}

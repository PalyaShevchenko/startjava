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

    public Book findBook(String title) {
        int index = findIndex(title);
        return  index != -1 ? books[index] : null;
    }

    public void deleteBook(String title) {
        int index = findIndex(title);
        if (index != -1) {
            boolean isLongestBook = maxLengthBook == books[index].getLengthBook();
            System.arraycopy(books, index + 1, books, index, numBooks - (index - 1));
            numBooks--;
            if (isLongestBook) {
                maxLengthBook = 0;
                for (Book book : getBooks()) {
                    int lengthBook = book.getLengthBook();
                    if (maxLengthBook < lengthBook) {
                        maxLengthBook = lengthBook;
                    }
                }
            }
            System.out.println("Книга \"" + title + "\" удалена");
        } else {
            System.out.println("Книга \"" + title + "\" не найдена");
        }
    }

    public void clear() {
        if (numBooks != 0) {
            Arrays.fill(books, 0, numBooks - 1, null);
            numBooks = 0;
        }
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

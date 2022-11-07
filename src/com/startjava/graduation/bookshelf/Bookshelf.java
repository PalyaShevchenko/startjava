package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class Bookshelf {

    public static int NUM_SHELVES = 10;
    private int numBooks;
    private int widthShelve;
    private Book[] books = new Book[NUM_SHELVES];

    public boolean menu(int menuItem){
        switch (menuItem) {
            case 1 -> {
                if (numBooks != 10) {
                    addBook();// Добавить книгу
                } else {
                    System.out.println("В шкафу больше нет места");
                }
                return true;
            }
            case 2 -> {
                if (numBooks != 0) {
                    deleteBook(); // Удалить книгу
                } else {
                    System.out.println("Больше нечего удалять");
                }
                return true;
            }
            case 3 -> {
                clearBookshelf();// Очистить шкаф
                return true;
            }
            case 4 -> {return false;}// Выход
            default -> {
                System.out.println("Введен некорректный пункт меню");
                return true;
            }
        }
    }

    private void addBook() {
        System.out.print("Введите название книги: ");
        Scanner console = new Scanner(System.in);
        books[numBooks] = new Book(console.nextLine());
        System.out.print("Введите автора книги: ");
        books[numBooks].setAuthor(console.nextLine());
        System.out.print("Введите год издания книги: ");
        books[numBooks].setPublication(console.nextLine());
        int neededWidthShelve = books[numBooks].getAuthor().length() + books[numBooks].getName().length()
                + books[numBooks].getPublication().length() + 6;
        if (neededWidthShelve > widthShelve) {
            widthShelve = neededWidthShelve;
        }
        numBooks++;
    }

    private void deleteBook() {
        System.out.println("Введите название книги, которую желаете убрать из шкафа: ");
        Scanner console = new Scanner(System.in);
        int index = findBook(console.nextLine());
        if (index != -1) {
            for (int i = index; i < numBooks - 1; i++) {
                books[i] = books[i+1];
            }
            numBooks--;
        }
    }

    private void clearBookshelf() {
        numBooks = 0;
    }

    private int findBook(String name) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getName().equals(name)) {
                return i;
            }
        }
        System.out.println("книга \"" + name + "\" не найдена");
        return -1;
    }

    private void printBookshelf() {
        if ( numBooks > 0) {
            System.out.println("В шкафу " + numBooks + " книги и свободно " + (10 - numBooks) + " полок");
            String minus = new String(new char[widthShelve]).replace('\0', '-');
            for (int i = 0; i < numBooks; i++) {
                int numSpace = widthShelve - (books[i].getAuthor().length() +
                        books[i].getName().length() + books[i].getPublication().length() + 5);
                String space = new String(new char[numSpace]).replace('\0', ' ');
                System.out.println("| " + books[i].getAuthor() + ", " + books[i].getName() +
                        ", " + books[i].getPublication() + space + "|");
                System.out.println("|" + minus + "|");
            }
        } else {
            System.out.println("Шкаф пуст");
        }
    }

    public void printMenu() {
        printBookshelf();
        System.out.println("1  Добавить книгу");
        System.out.println("2  Удалить книгу");
        System.out.println("3  Очистить шкаф");
        System.out.println("4  Выход");
    }
}

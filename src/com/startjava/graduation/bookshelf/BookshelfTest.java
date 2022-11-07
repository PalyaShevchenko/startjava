package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf MyBookshelf = new Bookshelf();
        Scanner console = new Scanner(System.in);
        do {
            MyBookshelf.printMenu();
            System.out.print("Введите пункт меню: ");
        } while (MyBookshelf.menu(console.nextInt()));
    }
}

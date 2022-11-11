package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookshelfTest {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf myBookshelf = new Bookshelf();
        do {
            printBookshelf(myBookshelf);
            printMenu();
            System.out.print("Введите пункт меню: ");
        } while (doAction(console.nextInt(), myBookshelf));
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        int numBooks = bookshelf.getNumBooks();
        if (numBooks > 0) {
            System.out.println("В шкафу " + numBooks + " книги и свободно " +
                    bookshelf.getFreeSize() + " полок");
            int maxWidthShelve = bookshelf.getMaxLengthBook();
            String line = "-".repeat(maxWidthShelve);
            for (Book book : bookshelf.getBooks()) {
                String space = " ".repeat(maxWidthShelve - book.getLengthBook());
                System.out.println("|" + book + space + "|");
                System.out.println("|" + line + "|");
            }
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private static void printMenu() {
        System.out.println("""
                    1  Добавить книгу
                    2  Найти книгу
                    3  Удалить книгу
                    4  Очистить шкаф
                    5  Выход
                    """);
    }

    private static boolean doAction(int menuItem, Bookshelf bookshelf) {
        Scanner console = new Scanner(System.in);
        switch (menuItem) {
            case 1 -> {
                if (bookshelf.getNumBooks() != Bookshelf.BOOKSHELF_SIZE) {
                    System.out.print("Введите название книги: ");
                    String title = console.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = console.nextLine();
                    try {
                        System.out.print("Введите год издания книги: ");
                        int year = console.nextInt();
                        Book book = new Book(author, title, year);
                        bookshelf.addBook(book);
                    } catch (InputMismatchException e) {
                        System.out.println("Год издания вводите цифрами. Книга не добавлена");
                    }
                    console.nextLine();
                } else {
                    System.out.println("В шкафу больше нет места");
                }
            }
            case 2 -> {
                System.out.print("Введите название книги, которую желаете найти: ");
                String title = console.nextLine();
                Book book = bookshelf.findBook(title);
                String string = book != null ? "Найдена книга: " + book :
                        "Книга \"" + title + "\" не найдена";
                System.out.println(string);
            }
            case 3 -> {
                if (bookshelf.getNumBooks() != 0) {
                    System.out.print("Введите название книги, которую желаете убрать из шкафа: ");
                    bookshelf.deleteBook(console.nextLine());
                } else {
                    System.out.println("Полка пуста");
                }
            }
            case 4 -> {
                bookshelf.clear();
                System.out.println("Полка очищена");
            }
            case 5 -> {
                return false; // Выход
            }
            default -> System.out.println("Введен некорректный пункт меню");
        }
        System.out.println("Для продолжения работы нажмите Enter");
        console.nextLine();
        return true;
    }
}

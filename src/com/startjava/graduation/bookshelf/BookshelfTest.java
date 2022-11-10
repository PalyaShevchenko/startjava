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
        } while (menu(console.nextInt(), myBookshelf));
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        int numBooks = bookshelf.getNumBooks();
        if (numBooks > 0) {
            System.out.println("В шкафу " + numBooks + " книги и свободно " + bookshelf.getFreeSize() + " полок");
            int maxWidthShelve = bookshelf.getMaxLengthBook();
            String line = new String(new char[maxWidthShelve]).replace('\0', '-');
            for (Book book : bookshelf.getBooks()) {
                int numSpace = maxWidthShelve - book.getLengthBook();
                String space = new String(new char[numSpace]).replace('\0', ' ');
                System.out.println("|" + book + space + "|");
                System.out.println("|" + line + "|");
            }
        } else {
            System.out.println("Шкаф пуст");
        }
    }

    private static void printMenu() {
        System.out.println("""
                    1  Добавить книгу
                    2  Найти книгу
                    3  Вывести количество книг на полке
                    4  Вывести количество свободных мест на полке
                    5  Удалить книгу
                    6  Очистить шкаф
                    7  Выход
                    """);
    }

    private static boolean menu(int menuItem, Bookshelf bookshelf) {
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
                        int year = console.nextInt(); //обработка ошибки
                        Book book = new Book(author, title, year);
                        bookshelf.addBook(book);// Добавить книгу
                    } catch (InputMismatchException e) {
                        System.out.println("Год издания вводите цифрами. Книга не добавлена");
                    }
                    console.nextLine();
                } else {
                    System.out.println("В шкафу больше нет места");
                }
            }
            case 2 -> {
                System.out.println("Введите название книги, которую желаете найти: ");
                String title = console.nextLine();
                Book book = bookshelf.getBook(title); // Найти книгу
                if (book != null) {
                    System.out.println(book);
                } else {
                    System.out.println("Книга \"" + title + "\" не найдена");
                }

            }
            case 3 -> System.out.println("Книг на полке: "  + bookshelf.getNumBooks());
            case 4 -> System.out.println("Свободно " + bookshelf.getFreeSize() + " мест");
            case 5 -> {
                if (bookshelf.getNumBooks() != 0) {
                    System.out.println("Введите название книги, которую желаете убрать из шкафа: ");
                    bookshelf.deleteBook(console.nextLine()); // Удалить книгу
                } else {
                    System.out.println("Больше нечего удалять");
                }
            }
            case 6 -> bookshelf.clear();// Очистить шкаф
            case 7 -> {
                return false; // Выход
            }
            default -> System.out.println("Введен некорректный пункт меню");
        }
        return true;
    }
}

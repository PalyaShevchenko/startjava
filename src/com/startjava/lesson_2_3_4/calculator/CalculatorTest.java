package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculatorTest {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        String userAnswer;
        do {
            System.out.print("Введите математическое выражение: ");
            try {
                System.out.print("результат " + Calculator.calc(console.nextLine()));
            } catch (NumberFormatException exception) {
                System.out.print("Число должно быть целым");
            } catch (ArithmeticException exception) {
                System.out.print("Деление на 0");
            } catch (IllegalStateException exception) {
                System.out.print("Некорректный знак операции");
            } catch (InputMismatchException exception) {
                System.out.print("Число должно быть больше 0");
            }
            do {
                System.out.print("\n\nХотите продолжить вычисления? [yes/no]:");
                userAnswer = console.nextLine().toLowerCase();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
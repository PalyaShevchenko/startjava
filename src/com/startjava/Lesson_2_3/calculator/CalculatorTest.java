package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String userAnswer;
        do {
            System.out.print("Введите первое число: ");
            calc.setNum1(console.nextInt());
            System.out.print("Введите знак математической операции: ");
            console.nextLine();
            calc.setSign(console.nextLine());
            System.out.print("Введите второе число: ");
            calc.setNum2(console.nextInt());
            System.out.print("результат " + calc.сalc());
            console.nextLine();
            do {
                System.out.print("\n\nХотите продолжить вычисления? [yes/no]:");
                userAnswer = console.nextLine().toLowerCase();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
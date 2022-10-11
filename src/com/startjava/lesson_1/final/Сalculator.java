package com.startjava.lesson_1.base;

public class Сalculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        long result;
        char sign = '^';
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = num1;
            for (int i = 2; i <= num2; i++) {
                result *= result;
            }
        } else {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
package com.startjava.lesson_2_3_4.calculator;

import java.util.InputMismatchException;

public class Calculator {

    public static long calc(String expression) {
        String[] partsExpression = expression.split(" ");
        int num1 = Integer.parseInt(partsExpression[0]);
        String mathOperator = partsExpression[1];
        int num2 = Integer.parseInt(partsExpression[2]);
        if ((num1 < 1) || (num2 < 1)) {
            throw new InputMismatchException();
        }
        return switch (mathOperator) {
            case "+" -> Math.addExact(num1, num2);
            case "-" -> Math.subtractExact(num1, num2);
            case "*" -> Math.multiplyExact(num1, num2);
            case "/" -> Math.floorDiv(num1, num2);
            case "^" -> (long) Math.pow(num1, num2);
            case "%" -> Math.floorMod(num1, num2);
            default -> throw new IllegalStateException(); //"неизвестный оператор"
        };
    }
}
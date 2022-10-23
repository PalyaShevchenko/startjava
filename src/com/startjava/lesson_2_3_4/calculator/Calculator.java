package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String expression;
    private int num1;
    private int num2;
    private String sign;

    public void setExpression(String expression) {
        this.expression = expression;
        String[] mathExpressionArr = expression.split(" ");
        num1 = Integer.parseInt(mathExpressionArr[0]);
        sign = mathExpressionArr[1];
        num2 = Integer.parseInt(mathExpressionArr[2]);
    }

    public long сalc() {

        switch (sign) {
            case "+" :
                return Math.addExact(num1, num2);
            case "-" :
                return Math.subtractExact(num1, num2);
            case "*" :
                return Math.multiplyExact(num1, num2);
            case "/" :
                return Math.floorDiv(num1, num2);
            case "^" :
                return (long) Math.pow(num1,num2);
            case "%" :
                return Math.floorMod(num1, num2);
            default:
                System.out.println("неизвестный оператор");
        }
        return 0;
    }
}
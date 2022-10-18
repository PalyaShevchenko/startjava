package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private String sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public long сalc() {
        //return result;
        switch (sign) {
            case "+" :
                return num1 + num2;
            case "-" :
                return num1 - num2;
            case "*" :
                return num1 * num2;
            case "/" :
                return  num1 / num2;
            case "^" :
                long result;
                result = num1;
                for (int i = 2; i <= num2; i++) {
                    result *= result;
                }
                return result;
            case "%" :
                return num1 % num2;
            default:
                System.out.println("неизвестный оператор");
        }
        return 0;
    }
}
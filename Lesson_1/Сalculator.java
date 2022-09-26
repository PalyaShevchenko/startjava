public class Сalculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        long result;
        char sign = '^';
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = a;
            for (int i = 2; i <= b; i++) {
                result *= result;
            }
        } else {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
import java.util.Scanner;

public class CalculatorTest {

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        Scanner scannerNum = new Scanner(System.in);
        Scanner scannerLine = new Scanner(System.in);
        String userReply;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scannerNum.nextInt();
            calc.setNum1(num1);
            System.out.print("Введите знак математической операции: ");
            String sign = scannerLine.nextLine();
            calc.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = scannerNum.nextInt();
            calc.setNum2(num2);
            System.out.print("результат " + calc.getResult());
            do {
                System.out.print("\n\nХотите продолжить вычисления? [yes/no]:");
                userReply = scannerLine.nextLine();
            } while ((!userReply.equalsIgnoreCase("yes")) && (!userReply.equalsIgnoreCase("no")));
        } while (userReply.equalsIgnoreCase("yes"));
    }
}
import java.util.Scanner;

public class CalculatorTest {

    public static void main (String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String userReply;
        do {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calc.setNum1(num1);
            System.out.print("Введите знак математической операции: ");
            scanner.nextLine();
            String sign = scanner.nextLine();
            calc.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calc.setNum2(num2);
            System.out.print("результат " + calc.getResult());
            do {
                System.out.print("\n\nХотите продолжить вычисления? [yes/no]:");
                scanner.nextLine();
                userReply = scanner.nextLine();
            } while ((!userReply.equalsIgnoreCase("yes")) && (!userReply.equalsIgnoreCase("no")));
        } while (userReply.equalsIgnoreCase("yes"));
    }
}
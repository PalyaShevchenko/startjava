public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int num = -10;
        int sumEven = 0;
        int sumOdd = 0; 
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            ++num;
        } while (num <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
            ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max;
        int min;
        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        if (num3 < min) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        num = 1234;
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            System.out.print("" + num %10);
            num /= 10;
        }
        System.out.println("                 " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int position = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            position++;
            if (position % 5 == 0) {
                System.out.println("");
                position = 0;
            }
        }
        for (int i = position; i < 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        num = 3141591;
        System.out.print("число " + num);
        sum = 0;
        while (num > 0) {
            if ((num % 10) == 1) {
                ++sum;
            }
            num /= 10;
        }
        if (sum / 2 == 0) {
            System.out.println(" содержит " + sum + " четное количество единиц");
        } else {
            System.out.println(" содержит " + sum + " нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int i = 1; i <= 5 ; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                --j;
            }
            --i;
            System.out.println("");
        }
        i = 1;
        do {
            int j = 1;
            System.out.println("$");
            do {
                System.out.print("$");
                ++j;
            } while ((j <= i) && (i < 3));
            ++i;
        } while (i < 5);

        System.out.println("\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%10s %9s %n","Dec", "Char");
        for (int j = 1; j <= 47; j += 2) {
            System.out.printf("%9d%9c%n", j, (char)j);
        }
        for (int j = 98; j <= 122; j += 2) {
            System.out.printf("%9d%9c%n", j, (char)j);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        num = 1234321;
        num1 = 0;
        int tmp = num;
        do {
            num1 = num1 * 10 + tmp % 10;
            tmp /= 10;
        } while (tmp > 0);
        if (num == num1) {
            System.out.println("число " + num + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        num = 246357;
        num1 = num / 1000;
        num2 = num % 1000;
        int sum1 = 0;
        sum = 0;
        for (i = 1; i <= 3; ++i) {
            sum += (num2 % 10);
            num2 /= 10;
            sum1 += (num1 % 10);
            num1 /= 10;
        }
        System.out.println("Сумма цифр " + num / 1000 + " = " + sum1);
        System.out.println("Сумма цифр " + num % 1000 + " = " + sum);
        if (sum == sum1) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        for (i = 1; i <= 9; ++i) {
            for (int j = 1; j <= 9; ++j) {
                if ((i == 1) && (j == 1)) {
                    System.out.printf("%3c%3c", ' ', 124);
                } else {
                    if (j == 1) {
                        System.out.printf("%3d%3c", (i * j), 124);
                    } else {
                        System.out.printf("%3d", (i * j));
                    }
                }
            }
            if (i == 1){
                System.out.println("");
                for (int m =1; m <= 10; ++m) {
                    System.out.printf("%3c", 22 );
                }
            }
            System.out.println("");
        }

    }
}
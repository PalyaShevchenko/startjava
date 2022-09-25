public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0; 
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1; 
        int min = num2;
        if (num1 < num2) {
            max = num2;
            min = num1;
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
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print("" + digit);
            num /= 10;
        }
        System.out.println("     " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%3d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
                counter = 0;
            }
        }
        for (int i = counter; i < 5; i++) {
            System.out.printf("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность\n");
        num = 3141591;
        System.out.print("число " + num);
        int countOnes = 0;
        while (num > 0) {
            if ((num % 10) == 1) {
                countOnes++;
            }
            num /= 10;
        }
        if (countOnes / 2 == 0) {
            System.out.println(" содержит " + countOnes + " четное количество единиц");
        } else {
            System.out.println(" содержит " + countOnes + " нечетное количество единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int rowNum = 1; rowNum <= 5; rowNum++) {
            for(int columnNum = 1; columnNum <= 10; columnNum++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int rowNum = 5;
        while (rowNum > 0) {
            int columnNum = rowNum;
            while (columnNum > 0) {
                System.out.print("#");
                columnNum--;
            }
            rowNum--;
            System.out.println();
        }

        rowNum = 1;
        int columnNum = 1;
        do {
            counter = 1;
            do {
                System.out.print("$");
                counter++;
            } while (counter <= columnNum);
            rowNum++;
            if (rowNum > 3) {
                columnNum--;
            } else {
                columnNum++;
            }
            System.out.println();
        } while (rowNum <= 5);

        System.out.println("\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%10s %9s %n","Dec", "Char");
        for (int i = 1; i <= 47; i += 2) {
            System.out.printf("%9d%9c%n", i, (char) i);
        }
        for (int i = 98; i <= 122; i += 2) {
            System.out.printf("%9d%9c%n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        num = 1234321;
        int reverseNum = 0;
        int copyNum = num;
        do {
            reverseNum = reverseNum * 10 + copyNum % 10;
            copyNum /= 10;
        } while (copyNum > 0);
        if (num == reverseNum) {
            System.out.println("число " + num + " является палиндромом");
        } else {
            System.out.println("число " + num + "  не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        num = 19324653;
        copyNum = num;
        int divider = 1;
        while (copyNum != 0) {
            copyNum /= 100;
            divider *= 10;
        }
        int digitsRight = num % divider;
        int digitsLeft = num / divider;
        int sumDigitsRight = 0;
        int sumDigitsLeft = 0;
        while (digitsRight != 0) {
            sumDigitsRight += (digitsRight % 10);
            digitsRight /= 10;
            sumDigitsLeft += (digitsLeft % 10);
            digitsLeft /= 10;
        }
        System.out.println("Сумма цифр " + num % divider + " = " + sumDigitsRight);
        System.out.println("Сумма цифр " + num / divider + " = " + sumDigitsLeft);
        if (sumDigitsRight == sumDigitsLeft) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%6c", '|');
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i =1; i <= 10; i++) {
            System.out.printf("%3c", '-' );
        }
        System.out.println();
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 1) {
                    System.out.printf("%3d%3c", (i * j), '|');
                } else {
                    System.out.printf("%3d", (i * j));
                }
            }
            System.out.println();
        }
    }
}
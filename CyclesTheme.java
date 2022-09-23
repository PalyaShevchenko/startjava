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
        int min = 10;
        int max = 5;
        int num1 = -1;
        if (max < min) {
            min += max;
            max = min - max;
            min -= max;
        }
        if (num1 < min) {
            min = num1;
        } else if (num1 > max) {
            max = num1;
        }
        for (int i = max - 1; i > min; --i) {
            System.out.print(" " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
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
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 5;
        while (i > 0) {
            int j = i;
            while (j > 0) {
                System.out.print("#");
                --j;
            }
            --i;
            System.out.println();
        }

        i = 1;
        int j = 1;
        do {
            counter = 1;
            do {
                System.out.print("$");
                counter++;
            } while (counter <= j);
            i++;
            if (i > 3) {
                j--;
            } else {
                j++;
            }
            System.out.println();
        } while (i <= 5);

        System.out.println("\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%10s %9s %n","Dec", "Char");
        for (j = 1; j <= 47; j += 2) {
            System.out.printf("%9d%9c%n", j, (char) j);
        }
        for (j = 98; j <= 122; j += 2) {
            System.out.printf("%9d%9c%n", j, (char) j);
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
        num = 1932465359;
        copyNum = num;
        int counterDigits = 0;
        int multiplierDigit = 1;
        while (copyNum != 0) {
            counterDigits++;
            copyNum /=10;
        }
        if ( counterDigits % 2 == 0) {
            for (i = 1; i <= counterDigits / 2; i++) {
                multiplierDigit *= 10;
            }
            int digitsRight = num % multiplierDigit;
            int digitsLeft = num / multiplierDigit;
            int sumDigitsRight = 0;
            int sumDigitsLeft = 0;
            while (digitsRight != 0) {
                sumDigitsRight += (digitsRight % 10);
                digitsRight /= 10;
                sumDigitsLeft += (digitsLeft % 10);
                digitsLeft /= 10;
            }
            System.out.println("Сумма цифр " + num % multiplierDigit + " = " + sumDigitsRight);
            System.out.println("Сумма цифр " + num / multiplierDigit + " = " + sumDigitsLeft);
            if (sumDigitsRight == sumDigitsLeft) {
                System.out.println("число является счастливым");
            } else {
                System.out.println("число не является счастливым");
            }
        } else {
            System.out.println("число неудовлетворяет требованию задания");
        }


        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.printf("%6c", '|');
        for (i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int m =1; m <= 10; m++) {
            System.out.printf("%3c", '-' );
        }
        System.out.println();
        for (i = 2; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
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
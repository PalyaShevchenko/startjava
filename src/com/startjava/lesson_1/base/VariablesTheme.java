package com.startjava.lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        byte numCores = 4;
        short numThreads = 8;
        int sizeRam = 8192;
        long sizeHdd = 1_000_203_087_872L;
        float frequencyCpu = 1.6f;
        double frequencyCpuMax = 3.4;
        char letterCodeCpu = 'U';
        boolean laptop = true;
        System.out.println("\n1. Создание переменных и вывод их значений на консоль\n");
        System.out.println("Это ноутбук? - " + laptop);
        System.out.println("Процессор Intel Core i5-8250" + letterCodeCpu);
        System.out.println("Количество ядер: " + numCores);
        System.out.println("Количество потоков: " + numThreads);
        System.out.println("Размер оперативной памяти: " + sizeRam +" Мб");
        System.out.println("Размер жесткого диска: " + sizeHdd + " байт");
        System.out.println("Базовая частота ядер: " + frequencyCpu + " ГГц" );
        System.out.println("Максимальная частота ядер в режиме Intel Turbo Boost: "
                + frequencyCpuMax + "ГГц\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook = 200;
        int percentDiscount = 11;
        double discount = (pricePen + priceBook) / 100 * percentDiscount;
        double discountPrice = pricePen + priceBook - discount;
        System.out.println("сумма скидки " + discount + "руб");
        System.out.println("общая стоимость товаров со скидкой " + discountPrice + "руб");

        System.out.println("\n3. Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных\n");
        byte byteMax = 127;
        short shortMax = 32_767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println("Тип byte:");
        System.out.println("первоначальное значение " + byteMax);
        System.out.println("значение после инкремента " + ++byteMax);
        System.out.println("значение после декремента " + --byteMax);
        System.out.println("Тип short:");
        System.out.println("первоначальное значение " + shortMax);
        System.out.println("значение после инкремента " + ++shortMax);
        System.out.println("значение после декремента " + --shortMax);
        System.out.println("Тип int:");
        System.out.println("первоначальное значение " + intMax);
        System.out.println("значение после инкремента " + ++intMax);
        System.out.println("значение после декремента " + --intMax);
        System.out.println("Тип long:");
        System.out.println("первоначальное значение " + longMax);
        System.out.println("значение после инкремента " + ++longMax);
        System.out.println("значение после декремента " + --longMax);

        System.out.println("\n5. Перестановка значений переменных\n");
        int num1 = 5;
        int num2 = 2;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: num1 = " + num1 + ",   num2 = " + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("новые значения переменных:    num1 = " + num1 + ",   num2 = " + num2);
        System.out.println("\nс помощью арифметических операций");
        System.out.println("исходные значения переменных: num1 = " + num1 + ",   num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("новые значения переменных:    num1 = " + num1 + ",   num2 = " + num2);
        System.out.println("\nс помощью побитовой операции ^");
        System.out.println("исходные значения переменных: num1 = " + num1 + ",   num2 = " + num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.println("новые значения переменных:    num1 = " + num1 + ",   num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char codeSymbol1 = 35;
        char codeSymbol2 = 38;
        char codeSymbol3 = 64;
        char codeSymbol4 = 94;
        char codeSymbol5 = 95;
        System.out.println("Таблица ASCII");
        System.out.println("Код   символ");
        System.out.println(" " + (int) codeSymbol1 + "    " + codeSymbol1);
        System.out.println(" " + (int) codeSymbol2 + "    " + codeSymbol2);
        System.out.println(" " + (int) codeSymbol3 + "    " + codeSymbol3);
        System.out.println(" " + (int) codeSymbol4 + "    " + codeSymbol4);
        System.out.println(" " + (int) codeSymbol5 + "    " + codeSymbol5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа\n");
        int num = 123;
        System.out.println("Число " + num + " содержит:");
        System.out.println(num / 100 + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underline = '_';
        char rBracket = '(';
        char lBracket = ')';
        char space = ' ';
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underline + rBracket + space + lBracket
                + backslash);
        System.out.println("" + space + slash + space + space + space + space + space +space
                + backslash);
        System.out.println("" + slash + underline + underline + underline + underline + slash 
                + backslash + underline + underline + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа\n");
        num = 345;
        int multiplicationDigits = (num / 100) * (num / 10 % 10) * (num % 10);
        int sumDigits = (num / 100) + (num / 10 % 10) + (num % 10);
        System.out.println("сумма цифр числа " + num +" = " + sumDigits);
        System.out.println("произведение цифр числа " + num + " = " + multiplicationDigits);

        System.out.println("\n10. Преобразование секунд\n");
        int totalSeconds = 86399;
        int hour = totalSeconds / 3600;
        int minute = totalSeconds / 60 % 60;
        totalSeconds = totalSeconds % 60;
        System.out.println("" + hour + ":" + minute + ":" + totalSeconds);
    }
}
package com.startjava.lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {2, 5, 3, 1, 6, 7, 4};
        System.out.println("Исходный массив");
        printIntArray(intArr);
        int length = intArr.length;
        for (int i = 0; i <= length / 2; i++) {
            --length;
            int temp = intArr[i];
            intArr[i] = intArr[length];
            intArr[length] = temp;
        }
        System.out.println("\nМассив после реверса значений");
        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int multNum = 1;
        for (int i = 1; i < length - 1; i++) {
            multNum *= i;
            System.out.print(i + (i != length - 2 ? " * " : " = " + multNum));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив");
        printDoubleArray(doubleArr, 8);
        double middleNum = doubleArr[doubleArr.length / 2];
        int countСhanges = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleNum) {
                doubleArr[i] = 0;
                countСhanges++;
            }
        }
        System.out.println("\nИзмененный массив");
        printDoubleArray(doubleArr, 8);
        System.out.println("\nКоличество обнуленных ячеек: " + countСhanges);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabetArr = new char[26];
        length = alphabetArr.length;
        for (int i = 0; i < length; i++) {
            alphabetArr[i] = (char) ('A' + i);
        }
        printAlphabet(alphabetArr);

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            boolean isUnique = false;
            do {
                intArr[i] = (int) ((Math.random() * (100 - 60)) + 60);
                for (int j = 0; j <= i - 1; j++) {
                    if (intArr[i] == intArr[j]) {
                        isUnique = true;
                        break;
                    }
                    isUnique = false;
                }
            } while (isUnique);
        }
        for (int i = 1; i < length-1; i++) {
            boolean isChange = false;
            for (int j = 0; j < length-i; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j + 1];
                    intArr[j + 1] = intArr[j];
                    intArr[j] = temp;
                    isChange = true;
                }
            }
            if (!isChange) {
                break;
            }
        }
        printIntArray(intArr, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = strArr.length;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (!strArr[i].isBlank()) {
                counter++;
            }
        }
        String[] strArrChange = new String[counter];
        int destPos = 0;
        int srcPos = 0;
        int i = 0;
        while (i < length) {
            int lengthCopy = 0;
            while (i < length && !strArr[i].isBlank()) {
                lengthCopy++;
                i++;
            }
            System.arraycopy(strArr, srcPos, strArrChange, destPos, lengthCopy);
            destPos += lengthCopy;
            i++;
            srcPos = i;
        }
        printStrArray(strArr);
        System.out.println();
        printStrArray(strArrChange);
    }

    private static void printIntArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void printDoubleArray(double[] nums, int numElementsLine) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%.3f ", nums[i]);
            if (i != 0 && (i + 1) % numElementsLine == 0){
                System.out.println();
            }
        }
    }

    private static void printAlphabet(char[] alphabet) {
        String letters = "";
        for (int i = alphabet.length - 1; i >= 0; i--) {
            letters += alphabet[i];
            System.out.println(letters);
        }
    }

    private static void printIntArray(int[] nums, int numElementsLine) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (i != 0 && (i + 1) % numElementsLine == 0) {
                System.out.println();
            }
        }
    }

    private static void printStrArray(String[] strArr) {
        for (String string : strArr) {
            System.out.print(string + " ");
        }
    }
}

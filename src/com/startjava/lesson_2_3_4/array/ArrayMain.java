package com.startjava.lesson_2_3_4.array;

public class ArrayMain {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {2, 5, 3, 1, 6, 7, 4};
        System.out.println("Исходный массив");
        printArray(intArr);
        int length = intArr.length;
        for (int i = 0; i <= length / 2; i++) {
            --length;
            int temp = intArr[i];
            intArr[i] = intArr[length];
            intArr[length] = temp;
        }
        System.out.println("\nМассив после реверса значений");
        printArray(intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
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

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив");
        printArrayFormat(doubleArr, 8);
        double valueCellMiddle = doubleArr[doubleArr.length / 2];
        int counterСhanges = 0;
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > valueCellMiddle) {
                doubleArr[i] = 0;
                counterСhanges++;
            }
        }
        System.out.println("Измененный массив");
        printArrayFormat(doubleArr, 8);
        System.out.println("Количество обнуленных ячеек: " + counterСhanges);

        System.out.println("4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letterArr = new char[26];
        length = letterArr.length;
        for (int i = 0; i < length; i++) {
            letterArr[i] = (char) (i+65);
        }
        printArrayLadder(letterArr);

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        intArr[0] = (int) ((Math.random()*(100-60))+60);
        for (int i = 1; i < length; i++) {
            boolean isNumRepeats = false;
            do {
                intArr[i] = (int) ((Math.random()*(100-60))+60);
                for (int j = 0; j <= i - 1; j++) {
                    if (intArr[i] == intArr[j]) {
                        isNumRepeats = true;
                        break;
                    } else {
                        isNumRepeats = false;
                    }
                }
            } while (isNumRepeats);
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
        printArrayFormat(intArr, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = strArr.length;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (strArr[i].isBlank()) {
                counter++;
            }
        }
        String[] strArrChange = new String[length - counter];
        int destPos = 0;
        int lengthCopy = 0;
        int i = 0;
        boolean isBlank = false;
        while (i < length) {

            if (!strArr[i].isBlank()) {
                lengthCopy++;
                isBlank = !strArr[i].isBlank();
                if(i == length - 1) {
                    System.arraycopy(strArr, i - lengthCopy + 1, strArrChange, destPos, lengthCopy);
                }
            }else if (isBlank) {
                System.arraycopy(strArr, i - lengthCopy, strArrChange, destPos, lengthCopy);
                destPos += lengthCopy;
                lengthCopy = 0;
                isBlank = strArr[i].isBlank();
            }
            i++;
        }
        printArrayStr(strArr);
        System.out.println();
        printArrayStr(strArrChange);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    private static void printArrayFormat(double[] nums, int numElementsLine) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%.3f ", nums[i]);
            if (i != 0 && (i + 1) % numElementsLine == 0){
                System.out.println();
            }
        }
    }

    private static void printArrayLadder(char[] letterArr) {
        String letters = "";
        for (int i = letterArr.length - 1; i >= 0; i--) {
            letters += letterArr[i];
            System.out.println(letters);
        }
    }

    private static void printArrayFormat(int[] nums, int numElementsLine) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            if (i != 0 && (i + 1) % numElementsLine == 0){
                System.out.println();
            }
        }
    }

    private static void printArrayStr(String[] strArr) {
        for (String string : strArr) {
            System.out.print(string + " ");
        }
    }
}

package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

    private String name;
    private int attempt;
    private int[] nums = new int[GuessNumber.ATTEMPTS_LIMIT];
    private int numWins;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addNum() {
        Scanner console = new Scanner(System.in);
        int num;
        boolean isNumInRange;
        do {
            isNumInRange = false;
            System.out.print("игрок " + getName() + " назовите число: ");
            num = console.nextInt();
            if ((num <= 0) || (num > 100)) {
                System.out.println("Введенное число, вне допустимого диапазона. Вводите числа от 1 до 100");
                isNumInRange = true;
            }
        } while (isNumInRange);
        nums[attempt] = num;
        attempt++;
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }

    public int getNumWins() {
        return numWins;
    }

    public void reset() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}
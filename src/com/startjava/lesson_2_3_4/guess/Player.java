package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] nums = new int[GuessNumber.NUM_ATTEMPTS];
    private int victory;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addNum(int num) {
        nums[attempt] = num;
        attempt++;
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }

    public int getVictory() {
        return victory;
    }

    public void reset() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }
}
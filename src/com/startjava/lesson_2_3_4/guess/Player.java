package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int attempt;
    private int[] nums = new int[GuessNumber.numAttempts];
    private Player nextPlayer;  // ссылка на следующего игрока

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setNum(int num) {
        nums[attempt] = num;
        if (attempt + 1 == nums.length) {
            System.out.println("У " + name + " закончились попытки"); //тут так можно?
        } else {
            attempt++;
        }
    }

    public int getNum(int attempt) {
        return nums[attempt];
    }

    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public void reset() {
        Arrays.fill(nums, 0, attempt, 0);
    }
}
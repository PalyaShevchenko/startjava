package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int NUM_ATTEMPTS = 2;
    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {

        this.player1 = player1;
        this.player2 = player2;
    }
    public void play() {
        secretNum = generateSecretNum();
        System.out.println("secretNum = " + secretNum);
        do {
            inputNum(player1);
            if (isGuessed(player1)) {
                break;
            }
            inputNum(player2);
            if (isGuessed(player2)) {
                break;
            }
        } while (player2.getAttempt() < NUM_ATTEMPTS);
        printPlayersAttempts(player1);
        printPlayersAttempts(player2);
        player1.reset();
        player2.reset();
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private void inputNum(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.print("игрок " + player.getName() + " назовите число: ");
        player.addNum(console.nextInt());
    }

    private boolean isGuessed(Player player) {
        if (secretNum == player.getNum()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                    " с " + player.getAttempt() + " попытки");
            return true;
        }
        if (secretNum > player.getNum()) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        }
        if ((player.getAttempt() == NUM_ATTEMPTS)) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void printPlayersAttempts(Player player) {
        for(int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
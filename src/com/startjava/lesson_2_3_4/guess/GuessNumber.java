package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int NUM_ATTEMPTS = 10;
    private Player player1;
    private Player player2;
    int secretNum;
    Scanner console = new Scanner(System.in);

    public GuessNumber(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        secretNum = generateSecretNum();
        System.out.println("secretNum = " + secretNum);
        do {
            inputNum(player1);
            if (isGuess(player1)){
                break;
            }
            inputNum(player2);
        } while (!isGuess(player2) && (player2.getAttempt() < NUM_ATTEMPTS));
        printNumsPlayer(player1);
        printNumsPlayer(player2);
        player1.reset();
        player2.reset();
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private boolean isGuess(Player player) {
        if (secretNum == player.getNum()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt()
                    + " попытки");
            return true;
        }
        if (secretNum > player.getNum()) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void inputNum(Player player) {
        System.out.print("игрок " + player.getName() + " назовите число: ");
        player.setNum(console.nextInt());
        player.setAttempt(player.getAttempt() + 1);
        if (player.getAttempt() == NUM_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void printNumsPlayer(Player player) {
        for(int num: player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
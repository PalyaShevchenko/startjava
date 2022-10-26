package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {

    public static final int numAttempts = 3;
    private Player player1;
    private Player player2;


    public GuessNumber(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner console = new Scanner(System.in);
        System.out.println("У каждого игрока по " + numAttempts + " попыток");
        Player activePlayer = player2;
        int secretNum = generateSecretNum();
        System.out.println("" + secretNum);
        do {
            activePlayer = activePlayer.getNextPlayer();

            System.out.print("игрок " + activePlayer.getName() + " назовите число: ");
            activePlayer.setNum(console.nextInt());
        } while (!compare(activePlayer, secretNum));
        printNumsPlayer(player1);
        printNumsPlayer(player2);
        player1.reset();
        player2.reset();
    }

    public void play1() {
        Scanner console = new Scanner(System.in);
        int secretNum = generateSecretNum();
        System.out.println("" + secretNum);
        do {
            System.out.print("игрок " + player1.getName() + " назовите число: ");
            player1.setNum(console.nextInt());
            if (compare(player1, secretNum)){
                break;
            }
            System.out.print("игрок " + player2.getName() + " назовите число: ");
            player2.setNum(console.nextInt());
        } while (!compare(player2, secretNum));
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private boolean compare(Player player,int secretNum) {
        if (secretNum == player.getNum(player.getAttempt() - 1)) {
            System.out.println("Число " + secretNum + " то, что загадал компьютер ");
            System.out.print("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt()
                    + " попытки");
            return true;
        }
        if (player.getNextPlayer().getAttempt() == numAttempts) {
            return true;
        }
        if (secretNum > player.getNum(player.getAttempt())) {
            System.out.println("Число " + player.getNum(player.getAttempt() - 1) + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum(player.getAttempt() - 1) + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void printNumsPlayer(Player player) {
        for(int num: player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int NUM_ATTEMPTS = 10;
    private Player[] player;
    private int secretNum;

    public GuessNumber(Player... player) {
        this.player = player;
    }

    public void shuffling() {
        for (int i = player.length - 1; i > 0; i--) {
            int index = (int) ((Math.random()) * (i + 1));
            Player temp = player[index];
            player[index] = player[i];
            player[i] = temp;
        }
    }

    public void play() {
        int numRound = 3;
        for (int i = 1; i <= numRound; i++) {
            secretNum = generateSecretNum();
            System.out.println("secretNum = " + secretNum);
            int length = player.length;
            int j = 0;
            do {
                inputNum(player[j]);
                if (isGuessed(player[j])) {
                    break;
                }
                j = ++j % length;
            } while (player[length - 1].getAttempt() < NUM_ATTEMPTS);
            for (j = 0; j < length; j++) {
                printPlayersAttempts(player[j]);
                player[j].reset();
            }
        }
        printNameVictory();
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private void inputNum(Player player) {
        Scanner console = new Scanner(System.in);
        int num;
        boolean isNumInRange;
        do {
            isNumInRange = false;
            System.out.print("игрок " + player.getName() + " назовите число: ");
            num = console.nextInt();
            if ((num <= 0) || (num > 100)) {
                System.out.println("Введенное число, вне допустимого диапазона. Вводите числа от 0 до 99");
                isNumInRange = true;
            }
        } while (isNumInRange);
        player.addNum(num);
    }

    private boolean isGuessed(Player player) {
        if (secretNum == player.getNum()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                    " с " + player.getAttempt() + " попытки");
            player.setVictory(player.getVictory() + 1);
            return true;
        }
        String inequality = (secretNum > player.getNum()) ? " меньше" : " больше";
        System.out.println("Число " + player.getNum() + inequality + " того, что загадал компьютер");
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

    private void printNameVictory() {
        int maxVictory = 0;
        for (int i = 0; i < player.length; i++) {
            if (maxVictory < player[i].getVictory()) {
                maxVictory = player[i].getVictory();
            }
        }
        if (maxVictory != 0) {
            System.out.println("Победа присуждается:");
            for (int i = 0; i < player.length; i++) {
                if (maxVictory == player[i].getVictory()) {
                    System.out.println(player[i].getName());
                }
            }
        } else {
            System.out.println("Никто не угадал числа");
        }
    }


}
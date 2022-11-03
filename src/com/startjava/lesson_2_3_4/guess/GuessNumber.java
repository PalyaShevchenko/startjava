package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int ATTEMPTS_LIMIT = 10;
    private static final int NUM_ROUNDS = 3;
    private Player[] players;
    private int secretNum;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void play() {
        castLots();
        for (int i = 1; i <= NUM_ROUNDS; i++) {
            System.out.println("Раунд " + i);
            secretNum = generateSecretNum();
            System.out.println("secretNum = " + secretNum);
            int length = players.length;
            int j = 0;
            do {
                Scanner console = new Scanner(System.in);
                do {
                    System.out.print("Игрок " + players[j].getName() + "введите число: ");
                }while (!players[j].addNum(console.nextInt()));
                if (isGuessed(players[j])) {
                    break;
                }
                j = ++j % length;
            } while (players[length - 1].getAttempt() < ATTEMPTS_LIMIT);
            for (Player player : players) {
                printPlayersAttempts(player);
                player.reset();
            }
        }
        printNameWinner();
    }

    private void castLots() {
        for (int i = players.length - 1; i > 0; i--) {
            int index = (int) ((Math.random()) * (i + 1));
            Player temp = players[index];
            players[index] = players[i];
            players[i] = temp;
        }
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private boolean isGuessed(Player player) {
        if (secretNum == player.getNum()) {
            System.out.println("Игрок " + player.getName() + " угадал число " + secretNum +
                    " с " + player.getAttempt() + " попытки");
            player.setNumWins(player.getNumWins() + 1);
            return true;
        }
        String inequality = (secretNum > player.getNum()) ? " меньше" : " больше";
        System.out.println("Число " + player.getNum() + inequality + " того, что загадал компьютер");
        if ((player.getAttempt() == ATTEMPTS_LIMIT)) {
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

    private void printNameWinner() {
        int maxNumWins = 0;
        for (Player player : players) {
            if (maxNumWins < player.getNumWins()) {
                maxNumWins = player.getNumWins();
            }
        }
        if (maxNumWins != 0) {
            System.out.println("Победа присуждается:");
            for (Player player : players) {
                if (maxNumWins == player.getNumWins()) {
                    System.out.println(player.getName());
                }
            }
        } else {
            System.out.println("Никто не угадал числа");
        }
    }
}
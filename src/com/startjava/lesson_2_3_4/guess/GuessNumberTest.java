package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers());
        String option;
        do {
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]:");
                option = console.nextLine().toLowerCase();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (option.equals("yes"));
    }

    private static Player[] createPlayers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = console.nextInt();
        console.nextLine();
        Player[] players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            players[i] = new Player(console.nextLine());
        }
        return players;
    }
}

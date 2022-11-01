package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = console.nextInt();
        console.nextLine();
        Player[] player = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            player[i] = new Player(console.nextLine());
        }
        GuessNumber game = new GuessNumber(player);
        game.shuffling();
        String options;
        do {
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]:");
                options = console.nextLine().toLowerCase();
            } while (!options.equals("yes") && !options.equals("no"));
        } while (options.equals("yes"));
    }
}

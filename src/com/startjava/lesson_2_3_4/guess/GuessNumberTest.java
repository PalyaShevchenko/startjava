package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        player1.setAttempt(0);
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        player2.setAttempt(0);

        player1.setNextPlayer(player2);
        player2.setNextPlayer(player1);

        GuessNumber game = new GuessNumber(player1, player2);
        String playerAnswer;
        do {
            game.play();
            //game.play1();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]:");
                playerAnswer = console.nextLine().toLowerCase();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}
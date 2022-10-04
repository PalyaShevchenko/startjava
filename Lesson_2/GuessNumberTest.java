import java.util.Scanner;

public class GuessNumberTest {

    public static void main (String[] args) {
        String userAnswer;
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.play();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]:");
                userAnswer = console.nextLine().toLowerCase();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        } while (userAnswer.equals("yes"));
    }
}
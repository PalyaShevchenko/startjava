import java.util.Scanner;

public class GuessNumber {
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner console = new Scanner(System.in);
        Player activePlayer = player2;
        int secretNum = generateSecretNum();
        System.out.println("" + secretNum);
        do {
            activePlayer = activePlayer != player1 ? player1 : player2;
            System.out.print("игрок " + activePlayer.getName() + " назовите число: ");
            activePlayer.setNum(console.nextInt());
        } while (!compare(activePlayer, secretNum));
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
        if (secretNum == player.getNum()) {
            System.out.println("Число " + secretNum + " то, что загадал компьютер ");
            System.out.print("Поздравляю с победой, " + player.getName() + " !");
            return true;
        }
        if (secretNum > player.getNum()) {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        }
        return false;
    }
}
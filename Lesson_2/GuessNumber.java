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
        Player activePlayer = null;
        int secretNum = generateSecretNum();
        //System.out.println("" + secretNum);
        do {
            if (activePlayer != player1) {
                activePlayer = player1;
            } else {
                activePlayer = player2;
            }
            System.out.print("игрок " + activePlayer.getName() + " назовите число: ");
            activePlayer.setNum(console.nextInt());
        } while (!compare(activePlayer.getNum(), secretNum));
        System.out.print("Поздравляею с победой, " + activePlayer.getName() + " !");
    }

    private int generateSecretNum() {
        return (int) ((Math.random() + 0.01) * 100);
    }

    private boolean compare(int num, int secretNum) {
        if (secretNum == num) {
            System.out.println("Число " + num + " то, что загадал компьютер ");
            return true;
        }
        if (secretNum > num) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
        }
        return false;
    }
}
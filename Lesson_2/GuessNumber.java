public class GuessNumber {
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1,Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Player activePlayer;
        int secretNum = getSecretNum();
        //System.out.println("" + secretNum);
        do {
            player1.setIsActive(!player1.getIsActive());
            if (player1.getIsActive()) {
                activePlayer = player1;
            } else {
                activePlayer = player2;
            }
            System.out.print("игрок " + activePlayer.getName() + " назовите число: ");
            activePlayer.guessingNum();
        } while (!compare(activePlayer.getNum(), secretNum));
    }

    private int getSecretNum() {
        return (int) ((Math.random() +0.01) * 100 );
    }

    private boolean compare( int num, int secretNum) {
        if (secretNum > num) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
            return false;
        } else if (secretNum < num) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Число " + num + " то, что загадал компьютер ");
            return true;
        }
    }
}
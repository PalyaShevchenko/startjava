public class MyFirstGame {
    public static void main (String[] args) {
        int numSecret = 22;
        int numLeft = 1;
        int numRight = 100;
        int numPlayer = 50;
        while (numPlayer != numSecret) {
            if (numPlayer > numSecret) {
                System.out.println("число " + numPlayer + " больше того, что загадал компьютер");
                numRight = numPlayer;
            } else {
                System.out.println("число " + numPlayer + " меньше того, что загадал компьютер");
                numLeft = numPlayer;
            }
            numPlayer = (numRight + numLeft) / 2;
        }
        System.out.println("Вы победили!");
    }
}
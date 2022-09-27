public class MyFirstGame {
    public static void main (String[] args) {
        int Secretnum = 22;
        int startRange = 1;
        int endRange = 100;
        int Playernum = 50;
        while (Playernum != Secretnum) {
            if (Playernum > Secretnum) {
                System.out.println("число " + Playernum + " больше того, что загадал компьютер");
                endRange = Playernum;
            } else {
                System.out.println("число " + Playernum + " меньше того, что загадал компьютер");
                startRange = Playernum;
            }
            Playernum = (endRange + startRange) / 2;
        }
        System.out.println("Вы победили!");
    }
}
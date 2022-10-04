import java.util.Scanner;

public class Player {

    private String name;
    private int number;
    private boolean isActive;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return number;
    }

    public void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    void guessingNum() {
        Scanner console = new Scanner(System.in);
        number = console.nextInt();
    }
}
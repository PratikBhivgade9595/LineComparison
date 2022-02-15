package Snake;

import java.util.Scanner;

public class UC2Dice {
    public static void main(String[] args) {
        int playerPosition = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player Name: ");
        String playerName = s.next();
        int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("The Number of dice is:" + diceRoll);
    }
}



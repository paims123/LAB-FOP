// Task 5: Define the Game class and a Tester class
package lab8q5;

import java.util.Random;

class Game{
    String playerName;
    private int score;
    
    public Game(String playerName){
        this.playerName = playerName;
        this.score = 0;
    }
    
    public void move(){
        Random random = new Random ();
        int diceRoll = random.nextInt(6) + 1;
        score += diceRoll;
        System.out.println(playerName + "rolled a" + diceRoll + "and now has a score of "+ score);
    }
    
    public int getScore(){
        return score;
    }
}

public class LAB8Q5 {

    public static void main(String[] args) {
        Game player1 = new Game("Player 1");
        Game player2 = new Game("Player 2");

        while (true) {
            player1.move();
            if (player1.getScore() >= 100) {
                System.out.println(player1.playerName + " wins!");
                break;
            }

            player2.move();
            if (player2.getScore() >= 100) {
                System.out.println(player2.playerName + " wins!");
                break;
            }
        }
    }
    
}

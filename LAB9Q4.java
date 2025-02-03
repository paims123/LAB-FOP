package lab9q4;

import java.util.Random;

class DiceGame1 {
    private int score;

    public DiceGame1() {
        score = 0;
    }

    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public void play() {
        while (score < 100) {
            int roll1 = rollDice();
            int roll2 = rollDice();
            System.out.printf("Rolled: %d, %d\n", roll1, roll2);
            if (roll1 == roll2) {
                System.out.println("You can roll again!");
                continue;
            }
            score += roll1 + roll2;
            System.out.printf("Current score: %d\n", score);
            if (score >= 100) {
                System.out.println("You win!");
                break;
            }
        }
    }
}

class DiceGame2 {
    private int score;

    public DiceGame2() {
        score = 0;
    }

    public int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public void play() {
        while (score < 100) {
            int roll = rollDice();
            System.out.printf("Rolled: %d\n", roll);
            if (roll == 6) {
                System.out.println("You can roll again!");
                int secondRoll = rollDice();
                System.out.printf("Second roll: %d\n", secondRoll);
                if (secondRoll == 6) {
                    System.out.println("Rolling a second 6 means no score!");
                    score -= roll;
                } else {
                    score += roll + secondRoll;
                }
            } else {
                score += roll;
            }
            System.out.printf("Current score: %d\n", score);
            if (score >= 100) {
                System.out.println("You win!");
                break;
            }
        }
    }
}

public class LAB9Q4 {

    public static void main(String[] args) {
        DiceGame1 game1 = new DiceGame1();
        game1.play();
        
        DiceGame2 game2 = new DiceGame2();
        game2.play();
    }
}
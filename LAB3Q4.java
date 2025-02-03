/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q4;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;
import java.util.Random;

public class LAB3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Player 1, press ENTER to roll the dice");
        scanner.nextLine();
        int P1R1 = random.nextInt(6)+1;
        int P1R2 = random.nextInt(6)+1;
        int SCORE1 = P1R1 + P1R2;
        
        System.out.println("Player 2, press ENTER to roll the dice");
        scanner.nextLine();
        int P2R1 = random.nextInt(6)+1;
        int P2R2 = random.nextInt(6)+1;
        int SCORE2 = P2R1 + P2R2;
        
        System.out.println("Player 1: " + P1R1 + " + " + P1R2 + " = " + SCORE1);
        System.out.println("Player 2: " + P2R1 + " + " + P2R2 + " = " + SCORE2);
        
        if(SCORE1 > SCORE2) {
            System.out.println("Player 1 win");
        }
        else if(SCORE2 > SCORE1) {
            System.out.println("Player 2 win");
        }
        else {
            System.out.println("FAIR");
        }

    }
    
}

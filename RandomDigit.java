/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB4Q6;

/**
 *
 * @author user
 */
import java.util.Random;

public class RandomDigit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int number = Math.abs(rand.nextInt()); // Generates a non-negative integer
        int digitCount = String.valueOf(number).length();
        
        System.out.println("Random Number: " + number);
        System.out.println("Number of digits: " + digitCount);
    }
    
}

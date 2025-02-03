/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q2;

/**
 *
 * @author FAHIM
 */
import java.util.Random;

public class LAB3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();
        int RN = random.nextInt(6);
        
        String words = " ";
        
        switch (RN){
            case 0 : words = "zero";
                break;
            case 1 : words = "one";
                break;
            case 2 : words = "two";
                break;
            case 3 : words = "three";
                break;
            case 4 : words = "four";
                break;
            case 5 : words = "five";
                break;    
                
        }
        System.out.println(+ RN + " is " + words);
    }
    
}

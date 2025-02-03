/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q6;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR RADIUS : ");
        double radius = scanner.nextDouble();
        System.out.println("ENTER YOUR X-COORDINATE : ");
        double X = scanner.nextDouble();
        System.out.println("ENTER YOUR Y-COORDINATE : ");
        double Y = scanner.nextDouble();
        
        double distance = Math.sqrt(X*X + Y*Y);
        if (distance <= radius){
            System.out.println("The point (" +X+ "," +Y+ ") is inside the circle");
            System.out.println("with distance : "+ distance);
        }
        else {
            System.out.println("The point (" +X+ "," +Y+ ") is outside the circle");
            System.out.println("with distance : "+ distance);
        }
    }
    
}

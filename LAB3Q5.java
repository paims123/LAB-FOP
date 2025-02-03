/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q5;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ENTER");
        System.out.print("A:");
        double A=scanner.nextDouble();
        System.out.print("B:");
        double B=scanner.nextDouble();
        System.out.print("C:");
        double C=scanner.nextDouble();
        System.out.print("D:");
        double D=scanner.nextDouble();
        System.out.print("E:");
        double E=scanner.nextDouble();
        System.out.print("F:");
        double F=scanner.nextDouble();
        
        double determinant = (A*D)-(B*C);
        if(determinant == 0){
            System.out.println("The equation has no solution");
        } 
        else{
        double Y = ((A*F)-(E*C))/ determinant;
        double X = ((E*D)-(B*F))/ determinant;
        
        
        System.out.print("The solution is: ");
        System.out.println("Y = " +Y);
        System.out.println("X = " +X);
        }
    
    }
    
}

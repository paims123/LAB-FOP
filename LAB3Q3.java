/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q3;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR TOTAL SALES : ");
        
        double sale = scanner.nextDouble();
        double commission = 1.0;
        
            if (sale > 1000){
                commission = sale * 0.125;
            }
            else if (sale > 500 && sale <= 1000){
                commission = sale * 0.10;
            }
            else if (sale > 100 && sale <= 500){
                commission = sale * 0.75;
            }
            else {
                commission = sale * 0.05;
            }
        
        System.out.println("YOUR COMMISSION = " +commission);
    
    }
}

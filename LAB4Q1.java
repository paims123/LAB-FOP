/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q1;

/**
 *
 * @author FAHIM
 * 
 */
import java.util.Scanner;

public class LAB4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter integer: ");
        int num= sc.nextInt();
        System.out.println("Factors: ");
        for(int i=1; i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }             
    }    
}

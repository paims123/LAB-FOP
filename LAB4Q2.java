/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q2;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an integer: ");
        int n=sc.nextInt();
        int total=0;
        for (int i=1;i<=n;i++){
            total+=(i*(i+1))/2;
        }
        System.out.println("total: "+ total);
    }
    
}

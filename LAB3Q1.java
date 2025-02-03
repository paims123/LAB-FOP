/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3q1;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first integer : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second integer : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter your operation : +  -  *  /  %  ");
        char opr = scanner.next().charAt(0);
        
        switch (opr){
            case '+' : 
                int sum = num1 + num2;
                System.out.println(+num1 + " + "+num2 + " = " +sum);
                break;
            case '-' : 
                int minus = num1 - num2;
                System.out.println(+num1 + " - "+num2 + " = " +minus);
                break; 
            case '*' : 
                int product = num1 * num2;
                System.out.println(+num1 + " * "+num2 + " = " +product);
                break;   
            case '/' : 
                int devide = num1 / num2;
                System.out.println(+num1 + " / "+num2 + " = " +devide);
                break;
            case '%' : 
                int remain = num1 % num2;
                System.out.println(+num1 + " % "+num2 + " the remainder is \n " +remain);
                break;
        }
    }
    
}

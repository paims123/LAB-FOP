/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q4;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("(0 for Sunday, 1 for Monday, … , 6 for Saturday) ");
        System.out.print("Enter first day of the year: ");
        int first = sc.nextInt();
        int firstMay = 0;
        int firstAugust = 0;
        //Determine if leap year
        if (year % 4 == 0 || year % 400 == 0){
            //leap year
            //May 1st= 122nd day
            //August 1st= 214th day
            firstMay = (122 % 7) + first;
            firstAugust = (214 % 7) + first;
        }
        else {
            //May 1st= 121th day
            //August 1st= 213th day
            firstMay = (121 % 7) + first;
            firstAugust = (213 % 7) + first;
        }
         //then loop +1 to make month calendar
         //May
        System.out.println("May: ");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat"); 
        int weekMay = 0;
        for (int i = 0; i < firstMay; i++){ 
                System.out.print("   ");
                weekMay++;      
        }
        for (int i = 1; i <= 31; i++){ 
                //width of 2 characters
                System.out.printf(" %2d ", i);
                weekMay++;
            // After printing 7 days    
            if (weekMay == 8) {
                System.out.println();
                weekMay = 1;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("August: ");
        //August
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat"); 
        int weekAug = 0;
        for (int i = 0; i < firstAugust; i++){ 
            System.out.print("   ");
            weekAug++;      
        }
        for (int i = 1; i <= 31; i++){ 
            //width of 2 characters
            System.out.printf(" %2d ", i);
            weekAug++;
            // After printing 7 days    
            if (weekAug == 8) { 
                System.out.println();
                weekAug = 1;
            }
        } 
    }
    
}

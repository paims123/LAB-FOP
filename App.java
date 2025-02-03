/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnumber;

import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random=new Random();
        int num1 = random.nextInt(41) + 10; 
        int num2 = random.nextInt(41) + 10;
        int num3 = random.nextInt(41) + 10;
        
        int sum=num1+num2+num3;
        double average=sum/3.0;
        
        System.out.println("The 3 random number is "+num1+","+num2+","+num3);
        System.out.println("Sum of 3 random number is"+sum);
        System.out.printf("Average of 3 random number is %.2f" , (float)average);
        
    }
}

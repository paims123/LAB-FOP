/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heatwaterenergy;

import java.util.Scanner;

public class HeatWaterEnergy {

    public static void main(String[] args) {
        Scanner hi=new Scanner(System.in);
        System.out.print("Enter the weight of water in kg: ");
        double M = hi.nextDouble();
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemp = hi.nextDouble();
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemp = hi.nextDouble();
        
        // Calculate the energy (Q = M * (final temperature - initial temperature) * 4184)
        double Q = M * (finalTemp - initialTemp) * 4184;
        
        // Display the energy needed
        System.out.printf("The energy needed to heat the water is: %.2f joules\n", Q);
    }
}

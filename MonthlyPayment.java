/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monthlypayment;

import java.util.Scanner;

public class MonthlyPayment {

    public static void main(String[] args) {
        Scanner hi=new Scanner (System.in);
        
        System.out.println("Enter the price of the car: ");
        double P=hi.nextDouble();
        System.out.println("Enter down payment: ");
        double D=hi.nextDouble();
        System.out.println("Enter interest rate in percentage: ");
        double R=hi.nextDouble();
        System.out.println("Enter loan duration in a year: ");
        double Y=hi.nextDouble();
        
        double M = (P - D) * (1 + R*Y/100) / (Y *12);
        System.out.println("Monthly payment is "+ M);
    }
}

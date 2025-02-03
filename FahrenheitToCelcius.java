/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fahrenheittocelcius;

import java.util.Scanner;

public class FahrenheitToCelcius {

    public static void main(String[] args) {
        Scanner hi=new Scanner(System.in);
        
        System.out.println("Enter temperature in Fahrenheit");
        double Fahrenheit=hi.nextDouble();
        double Celsius= (Fahrenheit-32) / 1.8;
        System.out.println("Temperature in Celsius"+ Celsius);
    }
}

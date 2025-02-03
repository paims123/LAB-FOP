/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumrandomnumber;

import java.util.Random;

public class SumRandomNumber {
    
    public static void main (String[]args){
    Random random=new Random();
    long randomNumber = random.nextLong(1000060001L); 

    String strNumber = String. valueOf(randomNumber);

    int sum = 0;

        for (int i = 0; i < strNumber. length(); i++) {

        sum += strNumber.charAt(i) - '0';

        System.out.println("Random Number: " + randomNumber);
        System.out.println("Sum of digits: " + sum);
        }
    }
}

    


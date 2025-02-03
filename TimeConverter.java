/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timeconverter;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner hi=new Scanner (System.in);
        
        System.out.println("Enter time in second");
        int sec=hi.nextInt();
        int hour=sec/3600;
        int minute=(sec%3600)/60;
        int second=sec%60;
        System.out.println("your time in hour minute second: "+hour+" hour "+minute+" minute "+second+" second ");
    }
}

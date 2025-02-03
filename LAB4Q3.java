/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4q3;

/**
 *
 * @author FAHIM
 */
import java.util.Scanner;

public class LAB4Q3 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num , n = 0, sum = 0, ssum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		while(true) {
			System.out.print("Enter a score [negative score to quit]: ");
			if((num = sc.nextInt()) < 0) break;
			sum += num; ssum += num * num; n++;
			if(num < min) min = num;
			if(num > max) max = num;
		}
		sc.close();

		double avg = sum / n;
		double var = (ssum - Math.pow(sum, 2) / n) / (double) (n - 1);
		double std = Math.sqrt(var);

		System.out.println("Minimum Score: " + min);
		System.out.println("Maximum Score: " + max);
		System.out.printf("Average Score: %.2f\n", avg);
		System.out.printf("Standard Deviation: %.2f\n ", std);
	}
}
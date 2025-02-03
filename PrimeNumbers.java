/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB4Q8;

/**
 *
 * @author FAHIM
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 100);
        System.out.printf("First %d prime number%s:\n", n, (n > 1) ? "s" : "");
        outer: 
        for(int val = 2, cnt = 0; cnt < n; val++) {
            for (int j = 2; j < val; j++) 
                if (val % j == 0) 
                    continue outer;
            System.out.printf("%3d%s%s", val, (cnt == n - 1) ? "" : ", ", ((cnt + 1) % 10 == 0) ? "\n" : "");
            cnt++;
        }
    }
    
}

package lab5q2;

import java.util.Random;

public class LAB5Q2 {

    public static void main(String[] args) {
        int min = 0, max = 20, range = max - min + 1, cnt = 0, n = 10;
        boolean[] set = new boolean[range];
        Random random = new Random(); // Create a Random object

        while (cnt < n) {
            int rand = random.nextInt(range) + min; // Generate a random number between min and max
            if (set[rand]) continue;
            set[rand] = true;
            cnt++;
        }

        for (int i = 0; i < range; i++) 
            if (set[i]) System.out.print(i + ", ");
    }
    
}

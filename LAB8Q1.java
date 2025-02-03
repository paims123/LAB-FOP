package lab8q1;

import java.util.*;

class Number {
    private int[] array;

    public Number() {
        this(10, 100);
    }

    public Number(int size) {
        this(size, 100);
    }

    public Number(int size, int maxRange) {
        array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxRange + 1);
        }
    }

    public void displayItems() {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public void displayEvenNumbers() {
        System.out.print("Even Numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void displayPrimeNumbers() {
        System.out.print("Prime Numbers: ");
        for (int num : array) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void displayMax() {
        int max = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        System.out.println("Maximum Number: " + max);
    }

    public void displayMin() {
        int min = Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
        System.out.println("Minimum Number: " + min);
    }

    public void displayAverage() {
        double average = Arrays.stream(array).average().orElse(0.0);
        System.out.println("Average: " + average);
    }

    public void displaySquares() {
        System.out.print("Squares: ");
        for (int num : array) {
            System.out.print((num * num) + " ");
        }
        System.out.println();
    }
}

public class LAB8Q1 {
    public static void main(String[] args) {
        Number a = new Number(); // 10 random integers within 0 to 100
        System.out.println("Array A:");
        a.displayItems();
        a.displayEvenNumbers();
        a.displayPrimeNumbers();
        a.displayMax();
        a.displayMin();
        a.displayAverage();
        a.displaySquares();

        Number b = new Number(5); // 5 random integers within 0 to 100
        System.out.println("\nArray B:");
        b.displayItems();
        b.displayEvenNumbers();
        b.displayPrimeNumbers();
        b.displayMax();
        b.displayMin();
        b.displayAverage();
        b.displaySquares();

        Number c = new Number(4, 50); // 4 random integers within 0 to 50
        System.out.println("\nArray C:");
        c.displayItems();
        c.displayEvenNumbers();
        c.displayPrimeNumbers();
        c.displayMax();
        c.displayMin();
        c.displayAverage();
        c.displaySquares();
    }
}

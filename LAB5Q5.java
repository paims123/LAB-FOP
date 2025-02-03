package lab5q5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LAB5Q5 {

    public static void main(String[] args) {
     
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = random.nextInt(101);
        }

        Arrays.sort(numbers);
        reverseArray(numbers);
        System.out.println("Sorted Numbers (Descending): " + Arrays.toString(numbers));

        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();

        // Linear Search
        long startTime = System.nanoTime();
        boolean linearFound = linearSearch(numbers, target);
        long linearTime = System.nanoTime() - startTime;

        // Binary Search
        startTime = System.nanoTime();
        boolean binaryFound = binarySearch(numbers, target);
        long binaryTime = System.nanoTime() - startTime;

        System.out.println("Linear Search: Found = " + linearFound + ", Time = " + linearTime + " ns");
        System.out.println("Binary Search: Found = " + binaryFound + ", Time = " + binaryTime + " ns");
    }

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static boolean linearSearch(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return true;
            } else if (array[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

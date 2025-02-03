 package lab6q6;

public class LAB6Q6 {

     public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static boolean isEmirp(int n) {
        int reversed = reverseNumber(n);
        return isPrime(n) && isPrime(reversed) && n != reversed;
    }

    public static void main(String[] args) {
        System.out.println("First 20 Palindromic Primes:");
        int count = 0, number = 2;
        while (count < 20) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        System.out.println("\n\nFirst 20 Emirp Numbers:");
        count = 0;
        number = 2;
        while (count < 20) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
    
}

package lab6q1;

public class LAB6Q1 {

    public static int triangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println("First 20 Triangular Numbers:");
        for (int i = 1; i <= 20; i++) {
            System.out.println("T" + i + " = " + triangularNumber(i));
        }
    }
    
}

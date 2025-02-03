// Task 7: Define the Money class and a Tester class
package lab8q7;

class Money {
    private double amount;

    public Money(double amount) {
        this.amount = roundAmount(amount);
    }

    private double roundAmount(double amount) {
        double remainder = amount % 0.05;
        if (remainder < 0.025) {
            return amount - remainder;
        } else {
            return amount + (0.05 - remainder);
        }
    }

    public void displayBreakdown() {
        int rm100 = (int) amount / 100;
        int rm50 = ((int) amount % 100) / 50;
        int rm10 = ((int) amount % 50) / 10;
        int rm5 = ((int) amount % 10) / 5;
        int rm1 = ((int) amount % 5);

        int cents = (int) Math.round((amount - (int) amount) * 100);
        int c50 = cents / 50;
        int c20 = (cents % 50) / 20;
        int c10 = (cents % 20) / 10;
        int c5 = (cents % 10) / 5;

        System.out.println("Breakdown:");
        System.out.println("RM100: " + rm100);
        System.out.println("RM50: " + rm50);
        System.out.println("RM10: " + rm10);
        System.out.println("RM5: " + rm5);
        System.out.println("RM1: " + rm1);
        System.out.println("50 cents: " + c50);
        System.out.println("20 cents: " + c20);
        System.out.println("10 cents: " + c10);
        System.out.println("5 cents: " + c5);
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtract(Money other) {
        if (this.amount >= other.amount) {
            return new Money(this.amount - other.amount);
        } else {
            throw new IllegalArgumentException("Insufficient amount for subtraction.");
        }
    }

    @Override
    public String toString() {
        return String.format("RM%.2f", amount);
    }
}


public class LAB8Q7 {

    public static void main(String[] args) {
        Money money1 = new Money(10.11);
        Money money2 = new Money(20.18);

        System.out.println("Money 1: " + money1);
        System.out.println("Money 2: " + money2);

        System.out.println("Breakdown of Money 1:");
        money1.displayBreakdown();

        System.out.println("Breakdown of Money 2:");
        money2.displayBreakdown();

        Money total = money1.add(money2);
        System.out.println("Total: " + total);
        System.out.println("Breakdown of Total:");
        total.displayBreakdown();

        try {
            Money difference = money2.subtract(money1);
            System.out.println("Difference: " + difference);
            System.out.println("Breakdown of Difference:");
            difference.displayBreakdown();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

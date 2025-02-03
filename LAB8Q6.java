// Task 6: Define the BurgerStall class and a Tester class
package lab8q6;

class BurgerStall {
    private static int totalBurgersSold = 0;
    private String stallID;
    private int burgersSold;

    public BurgerStall(String stallID) {
        this.stallID = stallID;
        this.burgersSold = 0;
    }

    public void sellBurgers(int count) {
        burgersSold += count;
        totalBurgersSold += count;
    }

    public void displaySales() {
        System.out.println("Stall " + stallID + " sold " + burgersSold + " burgers.");
    }

    public static void displayTotalSales() {
        System.out.println("Total burgers sold: " + totalBurgersSold);
    }
}

public class LAB8Q6 {

    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("001");
        BurgerStall stall2 = new BurgerStall("002");

        stall1.sellBurgers(50);
        stall2.sellBurgers(30);

        stall1.displaySales();
        stall2.displaySales();
        BurgerStall.displayTotalSales();
    }
    
}

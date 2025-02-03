// Task 2: Define the BankAccount class and a Tester class
package lab8q2;

class BankAccount{
    private String name;
    private String id;
    private double balance;
    
    public BankAccount(String name, String id, double initialDeposit){
        this.name = name;
        this.id = id;
        this.balance = initialDeposit;
    }
    
   public void displayAccountDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account ID: " + id);
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance+=amount;
            System.out.println("Deposited: "+ amount); 
        }else{
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance-=amount;
            System.out.println("Withdrawn: "+ amount);
        }else{
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }
    
    public void displayBalance(){
        System.out.println("Current balance: "+ balance);
    }
}

public class LAB8Q2 {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "A1234567", 500.0);
        account.displayAccountDetails();
        account.displayBalance();
        account.deposit(200.0);
        account.displayBalance();
        account.withdraw(100.0);
        account.displayBalance();
        account.withdraw(700.0);
    }
    
}

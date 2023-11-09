
package javaapplication61;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        balance += amount;
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);

        // Attempt to deposit an amount (can be negative)
        double depositAmount = 500; 

        try {
            account.deposit(depositAmount);
            System.out.println("Successfully deposited $" + depositAmount);
            System.out.println("Current balance: $" + account.getBalance());
        } catch (IllegalArgumentException e) {
            // Handle the exception if the deposit amount is negative
            System.out.println("Error: " + e.getMessage());
        }
    }
}

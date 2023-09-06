package javaapplication28;

public class BankAccount {

    private String name;
    private String branch;
    private double bankBalance;

    private static int numberOfAccounts=0;

    private static double totalAmount;
    private static double avgAmount;

    // Constructor
    public BankAccount(String name, String branch, double bankBalance) {
        this.name = name;
        this.branch = branch;
        this.bankBalance = bankBalance;
    }

    // Getters and setters for name, branch, and bankBalance
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    // Method to get the total balance
    public static double getTotalAmount() {
        return totalAmount;
    }

    // Method to get the average balance
    public static double getAverageAmount() {
        return avgAmount;
    }

    // Method to update the total balance and average balance
    public static void updateTotalAmountAndAverageBalance(double amount) {
        totalAmount += amount;
        avgAmount = totalAmount / numberOfAccounts;
        numberOfAccounts++;
    }
}

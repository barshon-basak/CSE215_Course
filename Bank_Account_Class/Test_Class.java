/*
1. You are tasked to make a BankAccount Class that contains the following variables String
name, String branch, double bankBalance, int numberOfAccounts (stores the number of
Accounts), double totalAmount (stores the total balance of all accounts), and double
avgAmount (stores the average balance of all accounts). Figure out which of the six
variables should be represented by the whole class and which of them is exclusive to an
object instance.
2. For the BankAccount Class, create a get and set method for name, branch, and
bankBalance variables.
3. Create a method that helps you get the total balance and average balance, however,
that/those methods should belong to the entire Class.
4. Create five instances of the BankAccount Class, and then print the average balance and
total balance. 
*/


package javaapplication28;


public class JavaApplication28 {

    public static void main(String[] args) {
       
        BankAccount account1 = new BankAccount("Mr. X", "Branch A", 1000.0);
        BankAccount.updateTotalAmountAndAverageBalance(account1.getBankBalance());

        BankAccount account2 = new BankAccount("Mr. Y", "Branch B", 2000.0);
        BankAccount.updateTotalAmountAndAverageBalance(account2.getBankBalance());

        BankAccount account3 = new BankAccount("Mr. Z", "Branch A", 1500.0);
        BankAccount.updateTotalAmountAndAverageBalance(account3.getBankBalance());

        
        System.out.println("Total Balance of All Accounts: " + BankAccount.getTotalAmount());
        System.out.println("Average Balance of All Accounts: " + BankAccount.getAverageAmount());
    }
}


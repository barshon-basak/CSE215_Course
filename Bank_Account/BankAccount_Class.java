
package javaapplication31;

import java.util.Arrays;

public class BankAccount {
    
     private Person accountHolder;
    private long accountNumber;
    private double balance;
    private int transactionLimit;
     private Transaction[] transactions; 
     private int transactionCount;
     
     public BankAccount() {
        transactions = new Transaction[100]; 
    }

    public BankAccount(Person accountHolder, int transactionLimit) {
        this.accountHolder = accountHolder;
        this.transactionLimit = transactionLimit;
       this.transactions = new Transaction[transactionLimit];
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionLimit() {
        return transactionLimit;
    }

     public Transaction[] getTransactions() {
        return transactions;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void makeTransaction(Transaction transaction) {
        if (transactionCount < transactionLimit) {
            transactions[transactionCount] = transaction;
            transactionCount++;

            if (transaction.getTransactionType().equals("deposit")) {
                balance += transaction.getTransactionAmount();
            } else if (transaction.getTransactionType().equals("withdraw")) {
                balance -= transaction.getTransactionAmount();
            }
        } else {
            System.out.println("Transaction limit exceeded.");
        }
    }

     public void printStatement() {
        System.out.println("Account Holder: " + accountHolder.getName());
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Transaction Limit: " + transactionLimit);
        System.out.println("Transactions:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i].toString());
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder=" + accountHolder +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", transactionLimit=" + transactionLimit +
                ", transactions=" + Arrays.toString(transactions) +
                '}';
    }
}

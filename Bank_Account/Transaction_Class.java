
package javaapplication31;


public class Transaction {
    
    private String transactionType;
    private double transactionAmount;
    
    public Transaction(){
    }
    
    public Transaction(String transactionType, double transactionAmount){
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    
     @Override
    public String toString() {
        return "Transaction{" +
                "transactionType='" + transactionType + '\'' +
                ", transactionAmount=" + transactionAmount +
                '}';
}
}

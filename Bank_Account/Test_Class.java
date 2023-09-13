
package javaapplication31;

import java.util.Scanner;

public class JavaApplication31 {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter holders name :");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
        System.out.println("Enter holders nid :");
        long nid ;
        nid = input.nextLong();
        
        Person person = new Person(name, nid);
        
        BankAccount bankAccount = new BankAccount(person, 5);

        Transaction deposit = new Transaction("deposit", 1000.0);
        Transaction withdraw = new Transaction("withdraw", 500.0);

        bankAccount.makeTransaction(deposit);
        bankAccount.makeTransaction(withdraw);

        bankAccount.printStatement();
    }
}
    

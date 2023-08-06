package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double mark;
       System.out.print("Enter your Mark: ");
      
       mark = input.nextDouble();
       
       if(mark>=93 && mark <=100){
           System.out.println("Your grade is A");
        }
        else if(mark>100){
           System.out.println("Invalid Mark");
        }
       else if(mark>=90){
           System.out.println("Your grade is A-");
        }
       else if(mark>=87){
           System.out.println("Your grade is B+");
        }
       else if(mark>=83){
           System.out.println("Your grade is B");
        }
       else {
           System.out.println("Your grade is Fail");
        }
    }
}

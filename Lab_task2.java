//2. Write a program that determines if an integer is odd or even.

package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

        public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        num = input.nextInt();
        
        if(num%2 == 0){
        System.out.println("This is an even Number");}
        
        else {
        System.out.println("This an odd Number");}
    }
    
}

//Write a program that takes the radius of a circle as user input and shows the area in the output.

package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {
 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("enter the radius of the circle : ");
       int radius = input.nextInt();
       
       double area = 3.1416 * radius * radius ;
       
       System.out.println("The area is "+area);
    }
    
}

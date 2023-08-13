
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {
   
    public static void main(String[] args) {
        int flag=0;
        double new1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
        double[] arr = new double[10];
        for (int i=0; i<10 ; i++){
        arr[i]= input.nextDouble();
        }
        System.out.println("Enter another number to check :");
         new1 = input.nextDouble();
        for (int i=0; i<10 ; i++){
        if(new1== arr[i]){
            System.out.println("Found");
        flag=1;}
        }
        if(flag==0){
            System.out.println("Not Found");}
    }
    
}

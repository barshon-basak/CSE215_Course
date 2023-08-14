package javaapplication14;

import java.util.Scanner;

public class JavaApplication14 {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       int n;
       System.out.println("Enter a number : ");
       n = input.nextInt();
       int[] arr = new int[n];
       if (n >= 1) {
            arr[0] = 0;
        }
        if (n >= 2) {
            arr[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("First "+n+" Fibonacci numbers: ");
        for(int i=0 ; i<n ; i++){
            System.out.print(" "+arr[i]);
            }
        System.out.print("\n");
    }
    
}

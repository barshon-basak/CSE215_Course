
package javaapplication40;

import java.util.Scanner;

public class JavaApplication40 {


    public static void main(String[] args) {
        
        int[] arr = new int[100];

       
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an index: ");
        int index = sc.nextInt();

        try {
            System.out.println("The element at index " + index + " is: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }

    }
}

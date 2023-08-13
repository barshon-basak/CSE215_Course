
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int row,column;
       double sum= 0.0;
       System.out.println("Enter the row of the array : ");
       row= input.nextInt();
       System.out.println("Enter the colum of the array : ");
       column= input.nextInt();
       double[][] arr = new double[row][column];
       for(int i=0 ;i<row ; i++){
            for(int j=0; j<column ; j++){
            arr[i][j]= input.nextDouble();
            }}
       for(int i=0 ;i<row ; i++){
            for(int j=0; j<column ; j++){
            if(i==j){
            sum = sum + arr[i][j];
            }}}
        System.out.println("\nThe sum is "+sum);
    }
    
}

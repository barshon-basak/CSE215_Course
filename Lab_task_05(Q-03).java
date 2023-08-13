package javaapplication10;

import java.util.Scanner;

public class JavaApplication10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the row and column of matrices : ");
        int row,col;
        row = input.nextInt();
        col = input.nextInt();
       int[][] arr1 = new int[row][col];
       int[][] arr2 = new int[row][col];
       int[][] arr3 = new int[row][col];
        System.out.println("Enter the elements of first matrix: ");
       for(int i=0; i<row ; i++){
        for(int j=0 ; j<col ; j++){
            arr1[i][j]= input.nextInt();}}
        System.out.println("Enter the elements of Second matrix: ");
       for(int i=0; i<row ; i++){
        for(int j=0 ; j<col ; j++){
            arr2[i][j]= input.nextInt();}}
       
       for(int i=0; i<row ; i++){
        for(int j=0 ; j<col ; j++){
        arr3[i][j]= arr1[i][j] + arr2[i][j];
                }}
       
        System.out.println("The sum of two matrices is : ");
       for(int i=0; i<row ; i++){
        for(int j=0 ; j<col ; j++){
            System.out.print(arr3[i][j]+" ");}
           System.out.print("\n");}
    }
    
}

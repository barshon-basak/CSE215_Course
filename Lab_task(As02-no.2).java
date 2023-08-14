package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {
 
    public static void main(String[] args) {
        int sum=0,count=0;
        double avg, perc;
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 elements: ");
        for(int i=0; i<6 ; i++){
        arr[i]= input.nextInt();
        sum+= arr[i];
        }
        avg = sum/6.0;
        System.out.println("The average is "+avg);
        for(int i=0 ; i<6 ; i++){
            if(arr[i]> avg){
            count++;
            }
        }
        perc = (count*100.0)/6.0 ;
        System.out.println("The percentage is "+perc+"%");
    }
    
}

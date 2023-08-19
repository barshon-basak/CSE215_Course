/*. Take an integer array and print only the numbers that are in consecutive orders of 3.

Enter size: 12

Enter numbers: 1 2 3 2 2 2 11 4 4 4 3 3

Output: 2 4
*/

package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the size :");
        n= input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(int i=0 ; i<n ; i++){
        arr[i] = input.nextInt();
        }
        System.out.print("\nThe numbers that are in consecutive orders of 3: ");
        int count=1;
        for(int i=1 ; i<n ; i++){
            if(arr[i-1]== arr[i]){
                   count++;
                   if(count==3){
                       System.out.print(arr[i]+" ");}
            }
            else count=1;
        }
    }
    
}

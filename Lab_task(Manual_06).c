
package javaapplication20;

import java.util.Scanner;

public class JavaApplication20 {

   public static boolean isEven(int num){
         return num % 2 == 0;
  
   }
    
   public static void generateEven(int min , int max){
          for(int i=min ; i<=max ; i++){
              if(isEven(i)){
                  System.out.print(i+" ");
              }
          }  
   
   }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum range: ");
        int min = input.nextInt();
        System.out.println("Enter the maximum range: ");
        int max =  input.nextInt();
        
        generateEven(min,max);
    }
    
}

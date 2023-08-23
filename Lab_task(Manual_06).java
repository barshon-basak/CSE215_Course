package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {
   
    public static boolean isPalindrome(String str){
        char[] str2 = new char[str.length()];
            for(int i=0 ; i<str.length() ; i++){
                str2[i] = str.charAt(str.length()-i-1);
            }
            
          return str.equals(new String(str2));
} 
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter a string : ");
       String str = input.next();
       boolean val = isPalindrome(str);
       if(val==true){
           System.out.println("This is a Palindrome.");}
       else System.out.println("This is not a palindrome.");
    }
    
}

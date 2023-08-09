package javaapplication14;
import java.util.Scanner;
public class JavaApplication14 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,ans, num2;
        char alp;
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        System.out.println("Enter the command: ");
         alp = input.next().charAt(0);
         
        switch(alp){
            case '+':
                ans = num1+num2;
                System.out.println("ans = "+ans);
                break;
            case '-':
                ans = num1-num2;
                System.out.println("ans = "+ans);
                break;
            case '*':
                ans = num1*num2;
                System.out.println("ans = "+ans);
                break;
            case '/':
                ans = num1/num2;
                System.out.println("ans = "+ans);
                break;
        }
    }
   
}

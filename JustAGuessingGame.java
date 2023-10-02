
package javaapplication37;

import java.util.Scanner;


public class JavaApplication37 {

    public static void main(String[] args) {
       
        int num,guess,score=100,flag=1;
        
        guess= (int) (Math.random()*(9-1+1)+1);
        
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        num= input.nextInt();
        while(flag==1 && score>0){
            if(num==guess){
                System.out.println("Your score is "+score);
                flag=0;}
            else if(num>guess){
                System.out.println("Enter a smaller number: ");
                 num= input.nextInt();
                score -= 10;}
            else {
                System.out.println("Enter a larger number: ");
                 num= input.nextInt();
                score -= 10;}

        }
        if(score==0){
            System.out.println("You lose the game,");
            System.out.println("the number was "+guess);}
    }
    
}

import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
       Scanner input = new Scanner(System.in);
       int random,num,num1,num2,rand1,rand2;
      // random = (int)(Math.random()*(99-10+1)+10);
      random =25;
       System.out.print("Enter any two digit number: ");
       num = input.nextInt();
       num1= num%10;
       num2= (num/10);
       rand1= random %10;
       rand2= random/10;
       System.out.println("The Randomly generated number was "+random);
       if((num1==rand1) && (num2 == rand2)){
           System.out.print("You won $10,000");
       }
        else if((num1==rand2) && (num2 == rand1)){
           System.out.print("You won $3,000");
       }
        else if((num1==rand2) || (num2 == rand1) || (num1==rand1) || (num2 == rand2)){
           System.out.print("You won $1,000");
       }
       else 
       System.out.print("Sorry, Better Luck Next time.");
     }
}

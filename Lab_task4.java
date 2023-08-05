
    package javaapplication6;

    import java.util.Scanner;

    public class JavaApplication6 {

        public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

           int year;
           System.out.println("enter a year to check leap year or not : ");
           year = input.nextInt();

           if(year %100 == 0){
           if(year % 400 == 0){
           System.out.println("This is a leap year");}
    
           else {
           System.out.println("This is not a leap year");}
           }

           else {
           if(year %4 ==0){
           System.out.println("This is a leap year");}

           else{
           System.out.println("This is not a leap year");}
           }
        }

    }

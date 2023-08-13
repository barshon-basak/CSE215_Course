package javaapplication13;

public class JavaApplication13 {
    
    public static void main(String[] args) {
        int min1=1000,max1=1500;
        int min2=1600, max2=2300;
       int min = (int)(min1 + Math.random()*(max1-min1+1));
       int max = (int)(min2 + Math.random()*(max2-min2+1));
       
      
       for(int n=min ; n<=max ; n++){
       if(n%100==0){
       if(n%400 ==0){
           System.out.print(n+" ");}
      }
       else{
       if(n%4==0){
           System.out.print(n+" ");}
       }
}
    } 
       }

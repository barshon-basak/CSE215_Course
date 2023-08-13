public class JavaApplication13 {
    public static void main(String[] args) {
        int min =1990;
        int max=2020;
        
       int n = (int)(min + Math.random()*(max-min+1));
        System.out.println("The random year is "+n);
       if(n%100==0){
       if(n%400 ==0){
           System.out.println("This is a leap year");}
       else {
           System.out.println("This is not a leap year");
       }}
       else{
       if(n%4==0){
           System.out.println("This is a leap year");}
       else System.out.println("This is not a leap year");}
}
}


package javaapplication72;

public class JavaApplication72 {

    public static void main(String[] args) {
            
        NewClass n1= new NewClass();
        n1.<String>genericsMethod("Barshon.");
        n1.<Integer>genericsMethod(25);
    }  
}
class NewClass {
    public <T> void genericsMethod(T data){
        System.out.print("Generics Method: ");
         System.out.println(" "+data);
    }
}

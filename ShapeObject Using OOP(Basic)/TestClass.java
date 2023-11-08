
package javaapplication54;

public class JavaApplication54 {

    public static void main(String[] args) {
        
        Square square = new Square("Square-1",5.00);
        
        System.out.println("Name: "+square.getName());
        System.out.println("Area: "+square.area());
        System.out.println("Perimeter: "+square.perimeter());
    }
    
}

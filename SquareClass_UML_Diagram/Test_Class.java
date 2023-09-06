
package javaapplication25;

public class JavaApplication25 {

    
    public static void main(String[] args) {
        
        Square square1 = new Square(5);
        
        System.out.println("Side length: " + square1.getSide());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("Diagonal length: " + square1.getDiagonal());
        
        square1.setSide(7.5);
        
        System.out.println("Side length: " + square1.getSide());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println("Diagonal length: " + square1.getDiagonal());
    }
    
}

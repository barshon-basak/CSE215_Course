
package javaapplication29;


public class JavaApplication29 {

    
    public static void main(String[] args) {
        
       Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);

        f1.add(f2);
        System.out.println("f1 + f2: " + f1);

        f1.sub(f2);
        System.out.println("f1 - f2: " + f1);

        f1.multiplication(f2);
        System.out.println("f1 * f2: " + f1);

        f1.division(f2);
        System.out.println("f1 / f2: " + f1);
    }
    
}


package javaapplication65;

public class JavaApplication65 {

    public static void main(String[] args) {
        Complex c1=new Complex(5.5,7.2);
        Complex c2=new Complex(-6.5,-4.88);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.add(c2));
        System.out.println(c1.multiply(c2));
    }
}

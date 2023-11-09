
package javaapplication58;


public class JavaApplication58 {

    public static void main(String[] args) {
        
        
       Rectangle rect1 = new Rectangle(15.0,10.0,"Rect-1");
        System.out.println("Details: ");
        System.out.println(rect1.toString());
        System.out.println("The area is: "+rect1.area());
        System.out.println("The perimeter : "+rect1.perimeter());
    }
    
}


package javaapplication66;


public class JavaApplication66 {

   public static void main(String[] args) {
        Shapes s1=new Sphere(500,true);
        Shapes s2=new Sphere(400,true);

        System.out.println(s1.compareTo((Sphere) s2));
        System.out.println("Object One-----");
        System.out.println(s1.getArea());
        System.out.println(s1.getVolume());
        System.out.println("Object Two-----");
        System.out.println(s2.getArea());
        System.out.println(s2.getVolume());
    }
}

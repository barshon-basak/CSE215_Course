
package javaapplication67;

public class JavaApplication67 {
public static void main(String[] args) {
        Shape3D s1=new Sphere(400,true);
        Shape3D c1=new Cube(4,true);

        System.out.println(s1.compareTo(c1));
        System.out.println(s1.getArea());
        System.out.println(s1.getVolume());

        System.out.println(c1.getArea());
        System.out.println(c1.getVolume());
    }
}

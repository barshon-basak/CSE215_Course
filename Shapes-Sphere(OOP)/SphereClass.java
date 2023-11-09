
package javaapplication66;


public class Sphere extends Shapes{
    private double radius;
    public Sphere(double radius,boolean filled) {
        super(filled);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*Math.pow(this.radius,3);
    }

    @Override
    public int compareTo(Sphere o) {
        return Double.compare(this.getVolume(),o.getVolume());
    }



}

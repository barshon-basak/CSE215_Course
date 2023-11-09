package javaapplication67;

public class Sphere extends Shape3D{
    private double radius;


    public Sphere(double radius,boolean filled) {
        super(filled);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                " radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double getVolume() {
        return 4/3*Math.PI*Math.pow(this.radius,3);
    }
}

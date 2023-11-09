
package javaapplication67;


public class Cube extends Shape3D{
    private double side;
    public Cube(double side,boolean filled) {
        super(filled);
        this.side=side;
    }

    @Override
    public double getArea() {
        return 6*Math.pow(this.side,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.side,3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
}

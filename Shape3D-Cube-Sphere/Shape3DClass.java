
package javaapplication67;


public abstract class Shape3D implements Comparable{
    private boolean filled;

    public Shape3D(boolean filled) {

        this.filled = filled;
    }
    public boolean isFilled(boolean filled){

        return true;
    }
    public abstract double getArea();
    public abstract double getVolume();

    @Override
    public int compareTo(Shape3D o) {

        return Boolean.compare(this.filled,o.filled);
    }
}

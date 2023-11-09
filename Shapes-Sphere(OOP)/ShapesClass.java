
package javaapplication66;


public abstract class Shapes {
    private boolean filled;

    public Shapes(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
        return true;
    }
    public abstract double getArea();
    public abstract double getVolume();
    public abstract int compareTo(Sphere o);

}

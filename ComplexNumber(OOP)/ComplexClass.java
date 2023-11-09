
package javaapplication65;
public class Complex {
    private double a;
    private double b;

    public Complex(double v){
        this.a=0.0;
        this.b=0.0;
    }
    public Complex(double a, double b){
        this.a=a;
        this.b=b;
    }
    public Complex(Complex t){
        this.a=t.a;
        this.b=t.b;
    }
    public Complex add(Complex t){
        return new Complex((this.a + t.a) ,  (this.b + t.b));
    }
    public Complex multiply(Complex t){
        return new Complex(((this.a*t.a)-(this.b*t.b)),((this.b*t.a)+(this.a*t.b)));
    }

    @Override
    public String toString() {
        return "Complex{" +
                "a=" + a +
                ", b=" + b +
                "i}";
    }
}

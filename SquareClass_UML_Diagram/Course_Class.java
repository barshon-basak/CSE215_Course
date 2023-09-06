
package javaapplication25;

public class Square {
    private double side;
    
    public Square(){
        this.side=1.0;
    }
    
    public Square(double s){
    this.side= s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    public double getArea(){
    return this.side*this.side;
    }
    
    public double getPerimeter(){
    return 4*this.side;
    }
    
    public double getDiagonal(){
    return this.side*Math.sqrt(2);
    }

}

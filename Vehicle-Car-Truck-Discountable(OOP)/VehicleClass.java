
package javaapplication64;

public abstract class Vehicle {
    private String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }
    
    public abstract double calculateFare();

    @Override
    public String toString() {
        return "Vehicle{" + "numberPlate=" + numberPlate + '}';
    }
    
    
}

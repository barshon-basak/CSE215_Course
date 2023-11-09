
package javaapplication64;


public class Car extends Vehicle {
    private int numberOfPassengers;

    public Car(int numberOfPassengers, String numberPlate) {
        super(numberPlate);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public double calculateFare() {
         return 20 + (numberOfPassengers * 5);
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "numberPlate='" + getNumberPlate() + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}

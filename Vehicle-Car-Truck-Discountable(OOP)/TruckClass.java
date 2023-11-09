
package javaapplication64;


public class Truck extends Vehicle {
    
    private double weightCarriedInKG;

    public Truck(double weightCarriedInKG, String numberPlate) {
        super(numberPlate);
        this.weightCarriedInKG = weightCarriedInKG;
    }

    public double getWeightCarriedInKG() {
        return weightCarriedInKG;
    }

    @Override
    public double calculateFare() {
        return 300+ weightCarriedInKG*2 ;
    }

    @Override
    public String toString() {
        return super.toString()+ "Truck{" + "weightCarriedInKG=" + weightCarriedInKG + '}';
    }
    
    
}

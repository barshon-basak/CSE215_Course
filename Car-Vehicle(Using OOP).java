
package javaapplication60;

public class JavaApplication60 {


    public static void main(final String[] args) {
       
        final Car oldCar = new Car();

       
        oldCar.tuneUpCost();

       
        boolean isBuiltBefore1990 = oldCar.builtBefore(1990);
        System.out.println("Is the car built before 1990? " + isBuiltBefore1990);
    }
}

interface IVehicle {
    double tuneUpCost();

    boolean canCarry(final int p0);
}

class Car implements IVehicle {
    @Override
    public double tuneUpCost() {
        return 100.0;
    }

    @Override
    public boolean canCarry(final int p0) {
        return true;
    }

    public boolean builtBefore(int year) {
       
        return this.getYear() < year;
    }

    
    public int getYear() {
        
        return 1980;
    }
}

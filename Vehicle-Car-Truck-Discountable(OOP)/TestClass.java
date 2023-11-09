package javaapplication64;

public class JavaApplication64 {

    public static void main(String[] args) {
             
        Car car = new Car(4, "ABC");
        double fare = car.calculateFare();
        PromoCodeDiscount promoCodeDiscount = new PromoCodeDiscount("NSU10");
        fare = promoCodeDiscount.applyDiscount(fare);
        System.out.println("The fare for the Car is: " + fare);

        Truck truck = new Truck(1000, "XYZ987");
        fare = truck.calculateFare();
        PromoCodeDiscount promoCodeDiscount2 = new PromoCodeDiscount("LAB15");
        fare = promoCodeDiscount2.applyDiscount(fare);

        System.out.println("The fare for the Truck is: " + fare);
    }
}

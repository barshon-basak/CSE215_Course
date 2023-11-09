class Car {
    private int speed;

    public void setSpeed(int speed) {
        if (speed > 60) {
            throw new IllegalArgumentException("Speed cannot exceed 60 mph.");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        // Set the car's speed
        int carSpeed = 70;  // Change this to the desired speed

        try {
            car.setSpeed(carSpeed);
            System.out.println("Car's speed set to: " + car.getSpeed() + " mph");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

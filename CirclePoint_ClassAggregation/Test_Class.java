
package prob_2;

import java.util.Scanner;

public class Prob_2 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x and y of the first point:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter the x and y of the second point:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        System.out.println("Enter the radius of the first circle:");
        double radius1 = scanner.nextDouble();
        System.out.println("Enter the radius of the second circle:");
        double radius2 = scanner.nextDouble();

        Circle circle1 = new Circle(radius1, point1);
        Circle circle2 = new Circle(radius2, point2);

        double distance = circle1.getDistance(circle2);

        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Distance between centers: " + distance);

    }
}


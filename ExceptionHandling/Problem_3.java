
package javaapplication40;

import java.util.Scanner;


class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("The sum of any two sides must be greater than the third side.");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

class IllegalTriangleException extends Exception {

    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 1, 5);
            double area = triangle.calculateArea();
            System.out.println("The area of the triangle is: " + area);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}

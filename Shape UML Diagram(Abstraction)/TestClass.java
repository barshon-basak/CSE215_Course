public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}

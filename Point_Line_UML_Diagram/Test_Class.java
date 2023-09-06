package javaapplication23;

public class JavaApplication23 {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        Line line1 = new Line(p1, p2);

        System.out.println("Line 1 start: " + line1.getStart());
        System.out.println("Line 1 end: " + line1.getEnd());
        System.out.println("Length of Line 1: " + line1.getLength());

        Point newStart = new Point(0, 0);
        line1.setStart(newStart);

        System.out.println("Updated Line 1 start: " + line1.getStart());
        System.out.println("Updated Line 1 end: " + line1.getEnd());
        System.out.println("Updated Length of Line 1: " + line1.getLength());

        Line line2 = new Line(2, 3, 5, 8);

        System.out.println("Line 2 start: " + line2.getStart());
        System.out.println("Line 2 end: " + line2.getEnd());
        System.out.println("Length of Line 2: " + line2.getLength());
    }
}

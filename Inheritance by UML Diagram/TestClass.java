public class ShapeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter stroke for Polygon:");
        double polyStroke = scanner.nextDouble();
        System.out.println("Fill the Polygon? (true/false):");
        boolean polyFill = scanner.nextBoolean();

        Polygon polygon = new Polygon(polyStroke, polyFill);
        polygon.printDetails();

        System.out.println("Enter unit for Triangle (e.g., cm, inch, m, ft):");
        String triangleUnit = scanner.next();
        System.out.println("Enter stroke for Triangle:");
        double triangleStroke = scanner.nextDouble();
        System.out.println("Fill the Triangle? (true/false):");
        boolean triangleFill = scanner.nextBoolean();

        Triangle triangle = new Triangle(triangleUnit, triangleStroke, triangleFill);
        triangle.printDetails();

        System.out.println("Enter base of Right Triangle:");
        double rtBase = scanner.nextDouble();
        System.out.println("Enter height of Right Triangle:");
        double rtHeight = scanner.nextDouble();

        RightTriangle rightTriangle = new RightTriangle(rtBase, rtHeight, triangleUnit, triangleStroke, triangleFill);
        rightTriangle.printDetails();

        System.out.println("Enter length of side for Equilateral Triangle:");
        double eqLengthOfSide = scanner.nextDouble();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(eqLengthOfSide, triangleUnit, triangleStroke, triangleFill);
        equilateralTriangle.printDetails();

     
    }
}

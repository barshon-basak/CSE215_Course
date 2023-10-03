class EquilateralTriangle extends Triangle {
    private double lengthOfSide;

    public EquilateralTriangle(double lengthOfSide, String unit, double stroke, boolean fill) {
        super(unit, stroke, fill);
        this.lengthOfSide = lengthOfSide;
    }

    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lengthOfSide, 2);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Length of Side: " + lengthOfSide + " " + unit);
        System.out.println("Area: " + getArea() + " square " + unit);
    }
}

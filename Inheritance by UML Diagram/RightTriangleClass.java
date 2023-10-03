class RightTriangle extends Triangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height, String unit, double stroke, boolean fill) {
        super(unit, stroke, fill);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Base: " + base + " " + unit);
        System.out.println("Height: " + height + " " + unit);
        System.out.println("Area: " + getArea() + " square " + unit);
    }
}

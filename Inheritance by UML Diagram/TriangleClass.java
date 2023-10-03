class Triangle extends Polygon {
    private String unit;

    public Triangle(String unit, double stroke, boolean fill) {
        super(stroke, fill);
        this.unit = unit;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Triangle Unit: " + unit);
    }
}

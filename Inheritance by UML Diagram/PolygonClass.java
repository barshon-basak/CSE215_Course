class Polygon {
    private double stroke;
    private boolean fill;

    public Polygon(double stroke, boolean fill) {
        this.stroke = stroke;
        this.fill = fill;
    }

    public void printDetails() {
        System.out.println("Polygon Details:");
        System.out.println("Stroke: " + stroke);
        System.out.println("Fill: " + fill);
    }
}

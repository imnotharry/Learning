public class RegularHexagon extends Shape {
    private double side;

    public RegularHexagon() {
        this.side = 1.0;
    }

    public RegularHexagon(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    @Override
    public double getPerimeter() {
        return 6 * side;
    }

    public double getSide() {
        return side;
    }
}

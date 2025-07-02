public class Triangle extends Shape {
    private double a, b, c;

    public Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
}

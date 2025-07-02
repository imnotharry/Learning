public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
    }
}

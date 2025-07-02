public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(3, 4, 5);
        Shape hexagon = new RegularHexagon(6);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(hexagon);
    }
}
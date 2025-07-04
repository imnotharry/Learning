import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testTriangleAreaAndPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.0001); // Right triangle with Heron’s formula
        assertEquals(12.0, triangle.getPerimeter(), 0.0001);
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    public void testRectangleAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle(3, 4);
        assertEquals(12.0, rectangle.getArea(), 0.0001);
        assertEquals(14.0, rectangle.getPerimeter(), 0.0001);
    }
}

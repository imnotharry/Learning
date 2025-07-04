import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    @Test
    public void testCircleAreaAndPerimeter() {
        Circle circle = new Circle(2.5);
        assertEquals(Math.PI * 2.5 * 2.5, circle.getArea(), 0.0001);
        assertEquals(2 * Math.PI * 2.5, circle.getPerimeter(), 0.0001);
    }
}

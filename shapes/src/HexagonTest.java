import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HexagonTest {
    @Test
    public void testRegularHexagonAreaAndPerimeter() {
        RegularHexagon hex = new RegularHexagon(6);
        assertEquals((3 * Math.sqrt(3) * 36) / 2, hex.getArea(), 0.0001);
        assertEquals(36.0, hex.getPerimeter(), 0.0001);
    }
}

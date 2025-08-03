import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testCalculateRentalCost() {
        Car car = new Car("ABC-123", 10000, Brand.BMW, "X5");
        double cost = car.calculateRentalCost(3);
        assertEquals(30000.0, cost, "Rental cost should be price * days");
    }
}


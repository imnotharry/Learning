import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RentalSystemTest {

    private RentalSystem rentalSystem;
    private Car testCar;

    @BeforeEach
    void setUp() {
        rentalSystem = new RentalSystem();
        testCar = new Car("TEST-001", 8000, Brand.MERCEDES, "C-Class");
        rentalSystem.addCar(testCar);
    }

    @Test
    void testAddCarAndFindByPlateNumber() {
        Car found = rentalSystem.findCarByPlateNumber("TEST-001");
        assertNotNull(found);
        assertEquals("TEST-001", found.getPlateNumber());
    }

    @Test
    void testRentCarRemovesItFromAvailableList() {
        rentalSystem.rentCar(testCar, 2);
        Car shouldBeNull = rentalSystem.findCarByPlateNumber("TEST-001");
        assertNull(shouldBeNull, "Car should be removed after renting");
    }

    @Test
    void testFindNonExistentCarReturnsNull() {
        Car notFound = rentalSystem.findCarByPlateNumber("XYZ-999");
        assertNull(notFound);
    }
}

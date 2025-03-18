import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MethodsTesting {
    //Task 1
    @Test
    void shouldBeFalse() {
        Assertions.assertFalse(Methods.isGreaterThan50(49));
    }

    @Test
    void shouldBeTrue() {
        Assertions.assertTrue(Methods.isGreaterThan50(51));
    }

    //Task 2
    @Test
    void returnGreatestNumberWhichIsAddedFirst() {
        Assertions.assertEquals(15, Methods.maxNumber(15, 14));
    }

    @Test
    void returnGreatestNumberWhichIsAddedSecond() {
        Assertions.assertEquals(12, Methods.maxNumber(11, 12));
    }

    //Task 3
    @Test
    void returnFirstNumberAsGreatest() {
        Assertions.assertNotEquals(21, Methods.isGreaterOrEqual(21, 20));
    }

    @Test
    void returnSecondNumberAsGreatest() {
        Assertions.assertNotEquals(31, Methods.isGreaterOrEqual(30, 31));
    }

    @Test
    void returnEqualNumbers() {
        Assertions.assertEquals(25, Methods.isGreaterOrEqual(25, 25));
    }
    //Task 4
}

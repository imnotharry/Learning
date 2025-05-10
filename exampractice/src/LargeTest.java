import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LargeTest {
    @Test
    void shouldBeCorrectGivenNumber() {
        assertTrue(Large.isValid(21));
    }

    @Test
    void shouldBeLowerNumber() {
        assertFalse(Large.isValid(19));
    }

    @Test
    void shouldBeGreaterNumber() {
        assertFalse(Large.isValid(1000001));
    }

    @Test
    void shouldSumEverySecondFactorial() {
        Assertions.assertEquals(933756928, Large.sumEverySecondFactorial(21));
    }
}

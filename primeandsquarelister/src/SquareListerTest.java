import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareListerTest {

    @Test
    void shouldReturnTrueBecauseNumberIsTwo() {
        Assertions.assertTrue(SquareLister.isValidInteger(2));
    }

    @Test
    void shouldReturnTwoBecauseNumberIsTwoBillion() {
        Assertions.assertTrue(SquareLister.isValidInteger(2000000000));
    }

    @Test
    void shouldReturnFalseBecauseNumberIsTooLow() {
        Assertions.assertFalse(SquareLister.isValidInteger(1));
    }

    @Test
    void shouldReturnFalseBecauseNumberIsTooHigh() {
        Assertions.assertFalse(SquareLister.isValidInteger(2000000001));
    }

}
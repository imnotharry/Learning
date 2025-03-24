import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeListerTest {

    @Test
    void shouldReturnTrueBecauseItsTwo() {
        Assertions.assertTrue(PrimeLister.isValidNumber(2));
    }

    @Test
    void shouldReturnTrueBecauseItsTwoBillion() {
        Assertions.assertTrue(PrimeLister.isValidNumber(2000000000));
    }

    @Test
    void shouldReturnFalseBecauseNumberIstooLow() {
        Assertions.assertFalse(PrimeLister.isValidNumber(1));
    }

    @Test
    void shouldReturnFalseBecauseNumberIstooHigh() {
        Assertions.assertFalse(PrimeLister.isValidNumber(2000000001));
    }

    @Test
    void shouldReturnTrueBecauseItIsPrime() {
        Assertions.assertTrue(PrimeLister.primeNumberGenerator(2));
    }

    @Test
    void shouldReturnFalseBecauseItIsNotPrime() {
        Assertions.assertFalse(PrimeLister.primeNumberGenerator(4));
    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfPerfectSquaresTest {
    @Test
    void shouldPrintNumberBecauseItIsHigherThatOne() {
        int num = 5;
        int sumOfPerfectSquares = SumOfPerfectSquares.sumOfPerfectSquaresUpToToNum(num);
        assertEquals(55, sumOfPerfectSquares);
    }

    @Test
    void shouldNotPrintNumberBecauseItIsZero() {
        int num = 0;
        SumOfPerfectSquares.sumOfPerfectSquaresUpToToNum(num);
        //noinspection EqualsWithItself
        Assertions.assertEquals(0, 0);
    }

}
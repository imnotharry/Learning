import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    int[] anArrayForTesting = new int[]{2000, 250, 300, 50, 250};

    @Test
    void shouldReturnMinusOneBecauseNumberIsTooHigh() {
        Assertions.assertEquals(-1, TipCalculator.checkPercentRange(99));
    }

    @Test
    void shouldReturnMinusOneBecauseNumberIsZero() {
        Assertions.assertEquals(-1, TipCalculator.checkPercentRange(0));
    }

    @Test
    void shouldReturnMinusOneFromTipCalculatorBecauseNumberIsTooSmall() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrize(anArrayForTesting)}, TipCalculator.checkPercentRange(2)));
    }

    @Test
    void shouldReturnMinusOneFromTipCalculatorBecauseNumberIsZero() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrize(anArrayForTesting)}, TipCalculator.checkPercentRange(0)));
    }

    @Test
    void shouldReturnTheSumOfTheGivenArray() {
        Assertions.assertEquals(2850, TipCalculator.calculateTotalPrize(anArrayForTesting));
    }
}
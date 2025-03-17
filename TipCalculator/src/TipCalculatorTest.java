import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TipCalculatorTest {
    int[] anArrayForTesting = new int[]{2000, 250, 300, 50, 250};


    @Test
    void shouldReturnMinusOneBecauseNumberIsZero() {
        Assertions.assertEquals(-1, TipCalculator.checkPercentRange(0));
    }

    @Test
    void shouldReturnMinusOneBecauseNumberIsTooLow() {
        Assertions.assertEquals(-1, TipCalculator.checkPercentRange(5));
    }

    @Test
    void shouldReturnMinusOneBecauseNumberIsTooHigh() {
        Assertions.assertEquals(-1, TipCalculator.checkPercentRange(85));
    }

    @Test
    void shouldReturnTheGivenPercentWhichIsBetween10And80() {
        Assertions.assertEquals(20, TipCalculator.checkPercentRange(20));
    }

    @Test
    void shouldReturnMinusOneFromTipCalculatorBecauseNumberIsZero() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrice(anArrayForTesting)}, TipCalculator.checkPercentRange(0)));
    }

    @Test
    void shouldReturnMinusOneFromTipCalculatorBecauseNumberIsTooLow() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrice(anArrayForTesting)}, TipCalculator.checkPercentRange(5)));
    }


    @Test
    void shouldReturnMinusOneFromTipCalculatorBecauseNumberIsTooHigh() {
        Assertions.assertEquals(-1, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrice(anArrayForTesting)}, TipCalculator.checkPercentRange(85)));
    }

    @Test
    void shouldReturnTheGoodValueFromTipCalculator() {
        Assertions.assertEquals(570, TipCalculator.calculateTip(new int[]{TipCalculator.calculateTotalPrice((anArrayForTesting))}, TipCalculator.checkPercentRange(20)));
    }

    @Test
    void shouldReturnTheSumOfTheGivenArray() {
        Assertions.assertEquals(2850, TipCalculator.calculateTotalPrice(anArrayForTesting));
    }
}
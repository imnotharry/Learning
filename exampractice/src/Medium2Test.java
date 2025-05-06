import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Medium2Test {
    int[] testArray = {1, 2, 3, 4};

    @Test
    void shouldReturnEight() {
        Assertions.assertEquals(8, Medium2.calculateWeirdNumbers(testArray));
    }
}

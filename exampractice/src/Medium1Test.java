import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Medium1Test {
    boolean[][][][] testArray1 = {{{{true, true}, {true, true}, {true, true}, {true, true}}}};
    boolean[][][][] testArray2 = {{{{false, false}, {false, false}, {false, false}, {false, false}}}};
    boolean[][][][] testArray3 = {{{{true, false}, {false, true}, {false, false}, {true, true}}}};

    @Test
    void shouldReturnTrue() {
        assertTrue(true, String.valueOf(Medium1.areAllValuesTrue(testArray1)));
    }

    @Test
    void shouldReturnFalse() {
        assertFalse(false, String.valueOf(Medium1.areAllValuesTrue(testArray2)));
    }

    @Test
    void shouldReturnFalseBecauseFalseAndTrueStatements() {
        assertFalse(false, String.valueOf(Medium1.areAllValuesTrue(testArray3)));
    }
}

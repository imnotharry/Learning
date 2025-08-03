import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeListerTest {
    private final List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19);

    @Test
    public void testNaive() {
        PrimeLister lister = new NaivePrimeLister();
        assertEquals(expected, lister.generatePrimesUpTo(20));
    }

    @Test
    public void testSqrt() {
        PrimeLister lister = new SqrtPrimeLister();
        assertEquals(expected, lister.generatePrimesUpTo(20));
    }

    @Test
    public void testSieve() {
        PrimeLister lister = new SievePrimeLister();
        assertEquals(expected, lister.generatePrimesUpTo(20));
    }
}


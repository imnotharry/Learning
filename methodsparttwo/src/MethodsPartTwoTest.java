import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MethodsPartTwoTest {
    String[] testArray1 = {"nothing", "happens"};
    String[] testArray2 = {"clutch", "brake", "gas"};
    boolean[] testArray3 = {true, true, true, false};
    boolean[] testArray4 = {false, false, false, true};
    int[] testArray5 = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
    int[] testArray6 = {-5, -4, -3, -2, -1, 0, 0, 0, 0, 0, 0};

    @Test
        //Task 3
    void shouldReturn30Percent() {
        Assertions.assertEquals(30, MethodsPartTwo.printThirtyPercent(100));
    }

    @Test
        //Task 4
    void shouldReturnNothing() {
        Assertions.assertArrayEquals(" ".toCharArray(), MethodsPartTwo.writeEmptyString(testArray1).toCharArray());
    }

    @Test
        //Task 5
    void shouldReturn42Point8Percent() {
        Assertions.assertEquals(42.8, MethodsPartTwo.get42Point8Percent(100));
    }

    @Test
        //Task 6
    void shouldReturnDoubleLength() {
        Assertions.assertEquals(44, MethodsPartTwo.writeDoubleLength("I will, but not today."));
    }

    @Test
        //Task 7
    void shouldReturnNoDifference() {
        Assertions.assertEquals(0, MethodsPartTwo.writeDifference(11, 11));
    }

    @Test
        //Task 7
    void shouldReturnGreaterDifference() {
        Assertions.assertEquals(1, MethodsPartTwo.writeDifference(10, 11));
    }

    @Test
        //Task 7
    void shouldReturnLesserDifference() {
        Assertions.assertEquals(-1, MethodsPartTwo.writeDifference(11, 10));
    }

    @Test
        //Task 8
    void shouldReturnSquareRootLength() {
        Assertions.assertEquals(4.69041575982343, MethodsPartTwo.returnSquareRoot("I will, but not today."));
    }

    @Test
        //Task 9
    void shouldReturnFactorialLength() {
        Assertions.assertEquals(1, MethodsPartTwo.returnFactorialLength("I will, but not today."));
    }

    @Test
        //Task 10
    void shouldReturnNumber() {
        Assertions.assertEquals(100, MethodsPartTwo.printDividedValueBy100(1));
    }

    @Test
        //Task 11
    void shouldReturnSquareBecauseNumberIsPrime() {
        Assertions.assertEquals(121, MethodsPartTwo.calculateWeirdPrime(11));
    }

    @Test
        //Task11
    void shouldReturnNumberBecauseItIsDivisibleBy4AndNotPrime() {
        Assertions.assertEquals(24, MethodsPartTwo.calculateWeirdPrime(12));
    }

    @Test
        //Task 11
    void shouldReturnNumberBecauseItIsNotDivisibleBy4AndNotPrime() {
        Assertions.assertEquals(27, MethodsPartTwo.calculateWeirdPrime(9));
    }

    @Test
        //Task 12
    void shouldReturnTheLengthOfTheGivenWords() {
        Assertions.assertEquals(6, 5, 3, Arrays.toString(MethodsPartTwo.printStringLengths(testArray2)));
    }

    @Test
        //Task 13
    void shouldReturn15Percent() {
        Assertions.assertEquals(15000, MethodsPartTwo.calculatePersonalIncomeTax(100000));
    }

    @Test
        //Task 13
    void shouldReturn18Point5Percent() {
        Assertions.assertEquals(18500, MethodsPartTwo.calculateSocialSecurityTax(100000));
    }

    @Test
        //Task 13
    void shouldReturnTotalValue() {
        Assertions.assertEquals(66500, MethodsPartTwo.calculateTotalSalary(100000, 15000, 18500));
    }

    @Test
        //Task 14
    void shouldReturnTrueFor3TrueStatement() {
        Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(MethodsPartTwo.calculateXOR(testArray3))));
    }

    @Test
        //Task 14
    void shouldReturnTrueFor3FalseStatement() {
        Assertions.assertTrue(Boolean.parseBoolean(String.valueOf(MethodsPartTwo.calculateXOR(testArray4))));
    }

    @Test
        //Task15
    void shouldReturnNegativeNumbers() {
        Assertions.assertArrayEquals(testArray6, MethodsPartTwo.printNegativeNumbers(testArray5));
    }
}
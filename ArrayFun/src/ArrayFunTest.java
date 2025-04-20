import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayFunTest {
    int[] testArray1 = {5, 10, 15, 20};
    int[] testArray2 = {25, 27, 14, 11};
    int[] testArray2Value = {625, 729, 121, 0};
    String[] testArray3 = {"apple", "Anna"};
    String[] testArray4 = {"I", "don't", "know"};
    int[] testArray5 = {10, 20, 30, 40};
    int[] testArray6 = {11, 11, 12, 12};
    String[][] testArray7 = {{"Hi,", "how",}, {"are", "you?"}};
    String[][] testArray8 = {{"I,", "don't", "want", "to"}, {"do", "stuff!"}};
    String[][] testArray9 = {{"Oh", "no"}, {"not", "again!"}};
    String[][] testArray10 = {{"want", "2", "buy", "code",}, {"want", "2", "sell", "stuff"}};
    boolean[][] testArray10Value = {{false, true, false, false}, {false, true, false, false}};
    String[][] testArray11 = {{"haha2"}, {"haha2"}};
    boolean[][] testArray11Value = {{true}, {true}};
    String[][] testArray12 = {{"he he"}, {"he he"}};
    boolean[][] testArray12Value = {{false}, {false}};
    String[][] testArray13 = {{"I", "don't", "know"}, {"what", "to", "do!"}};

    //Task 1
    @Test
    void shouldReturnTheAverageOfTheNumbers() {
        Assertions.assertEquals(15.0, ArrayFun.calculateTheAverageOfEvenNumbers(testArray1));
    }

    //Task 2
    @Test
    void shouldReturnTheSquareOfEvenNumbers() {
        assertArrayEquals(testArray2Value, ArrayFun.calculateSquaredOddNumbers(testArray2));
    }

    //Task 3
    @Test
    void shouldReturnTheNumbersOfTheStringsStartingWithA() {
        Assertions.assertEquals(2, ArrayFun.countLetterAInArray(testArray3));
    }

    //Task 4
    @Test
    void shouldConcatenateStringsLongerThan3Characters() {
        Assertions.assertEquals(0, 4, 4, ArrayFun.concatLongWords(testArray4));
    }

    //Task 5
    @Test
    void shouldReturnFalseBecauseThereAreNoDuplicates() {
        Assertions.assertFalse(ArrayFun.hasConsecutiveDuplicates(testArray5));
    }

    //Task 5
    @Test
    void shouldReturnTrueBecauseThereAreDuplicates() {
        Assertions.assertTrue(ArrayFun.hasConsecutiveDuplicates(testArray6));
    }

    //Task 6
    @Test
    void shouldReturnTheValueOfTheCountedStrings() {
        Assertions.assertEquals(6, ArrayFun.countTheGivenLetters(testArray7));
    }

    //Task 7
    @Test
    void shouldReturnTheLongestString() {
        Assertions.assertEquals(11, ArrayFun.sumLongestStringLengths(testArray8));
    }

    //Task 8
    @Test
    public void testUpperCaseAllString() {
        String[] expectedResults = {"OH", "NO", "NOT", "AGAIN!"};
        String[] actualResults = ArrayFun.uppercaseAllString(testArray9);
        for (int i = 0; i < actualResults.length; i++) {
            Assertions.assertEquals(expectedResults[i], actualResults[i]);
        }
    }

    //Task 9
    @Test
    void shouldReturnFalseAndTrue() {
        Assertions.assertArrayEquals(testArray10Value, ArrayFun.isContainDigit(testArray10));
    }

    //Task 9
    @Test
    void shouldReturnTrue() {
        Assertions.assertArrayEquals(testArray11Value, ArrayFun.isContainDigit(testArray11));
    }

    //Task 9
    @Test
    void shouldReturnFalse() {
        Assertions.assertArrayEquals(testArray12Value, ArrayFun.isContainDigit(testArray12));
    }

    //Task 10
    @Test
    void shouldReturnTheAverageLength() {
        Assertions.assertEquals(3.1666666666666665, ArrayFun.calculateAverageStringLength(testArray13));
    }
}
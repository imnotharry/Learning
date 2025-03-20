import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsTesting {
    int[][] testArray1 = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
    int[][] testArray2 = {{2, 2, 2}, {4, 4, 4}, {8, 8, 8}};
    int[][] testArray3 = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
    int[][] testArray4 = {{2, 4, 6, 8}, {8, 6, 4, 2}, {1, 3, 5, 7}, {7, 5, 3, 1}};
    //Task 1
    @Test
    void shouldBeFalse() {
        Assertions.assertFalse(Methods.isGreaterThan50(49));
    }

    @Test
    void shouldBeTrue() {
        Assertions.assertTrue(Methods.isGreaterThan50(51));
    }

    //Task 2
    @Test
    void returnGreatestNumberWhichIsAddedFirst() {
        assertEquals(15, Methods.maxNumber(15, 14));
    }

    @Test
    void returnGreatestNumberWhichIsAddedSecond() {
        assertEquals(12, Methods.maxNumber(11, 12));
    }

    //Task 3
    @Test
    void returnFirstNumberAsGreatest() {
        Assertions.assertNotEquals(21, Methods.isGreaterOrEqual(21, 20));
    }

    @Test
    void returnSecondNumberAsGreatest() {
        Assertions.assertNotEquals(31, Methods.isGreaterOrEqual(30, 31));
    }

    @Test
    void returnEqualNumbers() {
        assertEquals(25, 25, Methods.isGreaterOrEqual(25, 25));
    }

    //Task 6
    @Test
    void shouldBePrime() {
        Assertions.assertTrue(Methods.isPrime(7));
    }

    @Test
    void shouldNotBePrime() {
        Assertions.assertFalse(Methods.isPrime(4));
    }

    //Task 7
    @Test
    void shouldBeDivisible() {
        Assertions.assertTrue(Methods.isDivisibleBySecondNumber(20, 4));
    }

    @Test
    void shouldNotBeDivisible() {
        Assertions.assertFalse(Methods.isDivisibleBySecondNumber(4, 20));
    }

    //Task 8
    @Test
    void shouldBeEqualToThird() {
        Assertions.assertTrue(Methods.isEqualToThird(3, 3, 6));
    }

    @Test
    void shouldNotBeEqualToThird() {
        Assertions.assertFalse(Methods.isEqualToThird(3, 6, 3));
    }

    //Task 11
    @Test
    void shouldBeEqualWithTheTarget() {
        Assertions.assertTrue(Methods.canSumUp(100, 25, 45, 55, 75));
    }

    @Test
    void ShouldNotBeEqualWithTheTarget() {
        Assertions.assertFalse(Methods.canSumUp(95, 25, 45, 55, 75));
    }

    //Task 12
    @Test
    void shouldRepeatStringNTimes() {
        int result = Methods.repeatStrings("I don't know to be honest ", 3).length();
        int expected = "I don't know to be honest ".length() * 3;
        assertEquals(result, expected);
    }
    //Task 13
    @Test
    void shouldConcatenateStringsFromAnArray (){
        String result = Methods.concatenateStrings("Longest", "method", "ever. ");
        String expected = "Longestmethodever. ";
        assertEquals(result, expected);
    }
    //Task 14
    @Test
    void shouldWriteOutTheSumOfThe2DArray() {
        Assertions.assertEquals(90,Methods.sum2DArrayValue(testArray1));
    }
    //Task 15
    @Test
   void shouldReturnTheValueOfTheSubArrays(){
    Assertions.assertEquals(6,12,24, String.valueOf(Methods.sum2DArrayValue(testArray2)));
   }
   //Task 16
    @Test
    void shouldReturnTheSumOfTheMainDiagonalFrom2DArray(){
        Assertions.assertEquals(10, Methods.sumMainDiagonalFrom2DArray(testArray3));
    }
    //Task 17
    @Test
    void shouldReturnDiagonalDifferenceOfTheArray(){
        Assertions.assertEquals(8, Methods.diagonalDifferenceOfTheArray(testArray4));
    }
}
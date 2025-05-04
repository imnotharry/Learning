import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array4 = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println("The negative numbers of the array are: " + Arrays.toString(printNegativeNumbers(array4)));

    }
    public static int[] printNegativeNumbers(int[] numbers) {
        int[] resultArray = new int[countElementsInTheArray(numbers)];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (isNegative(numbers[i])) {
                resultArray[j] = (int) Math.pow(numbers[i], 2);
                j++;
            }
        }
        return resultArray;
    }
    }
    public static int countElementsInTheArray(int[] array) {
        int counter = 0;
        for (int number : array) {
            if (isNegative(number)) {
                counter++;

        }
        return counter;
    }
    public static boolean isNegative (int number){ return number <0; }
}

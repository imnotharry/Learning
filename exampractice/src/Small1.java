import java.util.Scanner;

public class Small1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter six numbers: ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];
        double value;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        value = Math.sqrt(max - min);

        System.out.println("The result of the square rooted " + max + "-" + min + " is " + " = " + value);

    }
}

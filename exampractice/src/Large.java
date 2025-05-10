import java.util.Scanner;

public class Large {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number between 20 and 1000000: ");
        int num = scanner.nextInt();
        isValid(num);
        System.out.println();
        System.out.println("The result is: " + sumEverySecondFactorial(num));

    }

    public static boolean isValid(int number) {
        return number > 20 && number < 1000000;
    }

    public static int sumEverySecondFactorial(int num) {
        int factorialSum = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println("The factorial of " + i + " is " + factorial);
        }

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                factorialSum += factorial;
                System.out.println("The sum of " + i + " factorial is: " + factorialSum);
            }
        }

        return factorialSum;
    }
}
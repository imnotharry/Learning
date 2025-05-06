import java.util.Scanner;

public class Large {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a number between 20 and 1000000: ");
        int num = scanner.nextInt();
        getNumberFromUser(num);
        System.out.println();
        System.out.println("The result is: " + sumEverySecondFactorial(num));

    }

    public static void getNumberFromUser(int num) {
        while (num < 20 || num > 1000000) {
            num = scanner.nextInt();
        }

    }

    public static int sumEverySecondFactorial(int num) {
        int factorialSum = 0;
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {
            System.out.println("The factorial of " + i + " is " + factorial);
            factorial *= i;
        }
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                factorialSum += factorial;
                System.out.println(factorialSum );
            }
        }
        return factorialSum;
    }
}
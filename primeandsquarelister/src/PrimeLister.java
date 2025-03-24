import java.util.Scanner;

public class PrimeLister {
    public static void main(String[] args) {
        printOutThePrimeNumbers(getANumberToListItsPrime());
    }

    public static boolean isValidNumber(int number) {
        return number >= 2 && number <= 2000000000;
    }

    public static boolean primeNumberGenerator(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }

    public static void printOutThePrimeNumbers(int input) {
        if (input == -1) {
            System.exit(0);
        }
        for (int i = 2; i <= input; i++) {
            if (primeNumberGenerator(i)) {
                System.out.println(i);
            }
        }
    }

    public static int getANumberToListItsPrime() {
        Scanner sc = new Scanner(System.in);
        int input;
        int trial = 0;
        System.out.println("Please enter a number, so i'll list all the prime numbers of the given number: ");
        while (trial < 5) {
            input = sc.nextInt();
            if (!isValidNumber(input)) {
                System.out.println("Try again!");
                trial++;
            } else {
                return input;
            }
        }
        System.out.println("Sorry, you gave the wrong number 5 times. Better luck next time!");
        return -1;
    }
}
import java.util.Scanner;

public class SquareLister {
    public static void main(String[] args) {
        printOutTheSquareNumber(getASquareNumber());
    }

    public static boolean isValidInteger(int number) {
        return number >= 2 && number <= 2000000000;
    }

    public static int getASquareNumber() {
        Scanner scanner = new Scanner(System.in);
        int input;
        int attempt = 0;
        System.out.println("Please enter a number, so i'll list all the square numbers of the given number: ");
        while (attempt < 5) {
            input = scanner.nextInt();
            if (!isValidInteger(input)) {
                System.out.println("Try again!");
                attempt++;
            } else {
                return input;
            }
        }
        System.out.println("Sorry, you gave the wrong number 5 times. Better luck next time!");
        return -1;
    }

    public static void printOutTheSquareNumber(int input) {
        if (input == -1) {
            System.exit(0);
        }
        for (int i = 1; i <= input; i++) {
            System.out.println(i * i);
        }
    }
}
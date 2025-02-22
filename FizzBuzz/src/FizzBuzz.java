import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Please write a number which must be greater than 0 ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int i = scanner.nextInt();
        if (i <= 105 && i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i <= 105 && i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i <= 105 && i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.err.println("Error!");
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class Practicing {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1.");
        System.out.println("Numbers between 1 and 500.");
        for (int i = 1; i <= 500; i++) {
            System.out.println(i);
        }
        System.out.println();
        //Task 2
        System.out.println("Task 2.");
        System.out.println("These numbers are divisible by 7 between 100 & 200.");
        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        //Task 3
        System.out.println("Task 3.");
        System.out.println("The sum of the numbers between 1 and 100.");
        int sum = 0;
        int number = 1;
        while (number <= 100) {
            sum += number;
            number++;
        }
        System.out.println(sum);
        System.out.println();

        //Task 4
        System.out.println("Task 4.");
        System.out.println("Numbers from 500 down to 1.");
        for (int i = 500; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
        //Task 5
        System.out.println("Task 5.");
        System.out.println("Numbers between 200 and 500 increased by 20 every time.");
        for (int i = 200; i <= 500; i += 20) {
            System.out.println(i);
        }
        System.out.println();
        //Task 6
        System.out.println("Task 6.");
        System.out.println("Please enter two number which products must be higher than 1500. :");
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        boolean result = (number1 * number2) > 1500;
        System.out.println("Is the product of the integers greater than 1500: " + result);
        System.out.println();
        //Task 7
        System.out.println("Task 7.");
        int number3;
        System.out.println("Please enter a number so i can tell you if it's divisible by 5 or not: ");
        number3 = scanner.nextInt();
        boolean result1 = (number3 % 5) == 0;
        if (result1) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5");
        }
        System.out.println();
        System.out.println("Difficult tasks downward.");
        System.out.println();
        //Task 8
        System.out.println("Task 8.");
        System.out.println("Adding numbers until their sum reaching 1000.");
        int sum8 = 0;
        while (sum8 < 1000) {
            System.out.println("Please enter a number:");
            Scanner sc10 = new Scanner(System.in);
            int num = sc10.nextInt();
            sum8 += num;
            System.out.println("The current sum is: " + sum8);
        }

        System.out.println("Sum is " + sum8);
        System.out.println();
        //Task 9
        System.out.println("Task 9.");
        System.out.println("If you enter a number, i'll print out their odd divisors.");
        Scanner scanner20 = new Scanner(System.in);
        long number20 = scanner20.nextLong();

        for (long i = number20; i >= 1; i--) {
            if (number20 % i == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        //Task 10
        System.out.println("Task 10.");
        System.out.println("Enter a number, so i can tell if it is a prime or not. ");
        int num;
        long divisor;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                System.out.println("The number is not prime");
                break;
            }
        }
        if (divisor >= num) {
            System.out.println("The number is prime");
        }
        System.out.println();
        //Task 11
        System.out.println("Task 11.");
        System.out.println("Please enter two number so i can tell you that if they are relative primes or not: ");
        Scanner sc11 = new Scanner(System.in);
        int num11 = sc11.nextInt();
        int num12 = sc11.nextInt();
    }
}
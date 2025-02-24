import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Please write a number which must be greater than 0! ");
            i = sc.nextInt();
            if (i < 1) {
                System.err.println("The number must be greater than 0!");
            }
        } while (i < 0);
        for (int j = 1; j < i + 1; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if (j % 3 == 0) {
                System.out.println("Fizz!");
            } else if (j % 5 == 0) {
                System.out.println("Buzz!");
            } else {
                System.out.println(j);
            }
        }
        sc.close();
    }
}
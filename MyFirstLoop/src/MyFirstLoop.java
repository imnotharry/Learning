import java.util.Scanner;

public class MyFirstLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("If you write a text I will write it out X time(s) : ");
        String text = scanner.nextLine();
        System.out.println("Write a number higher than 0 ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.err.println("I said write a number");
        }
        for (int i = 0; i < n; i++)
            System.out.println(text);
        scanner.close();
    }
}
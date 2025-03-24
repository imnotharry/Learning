import java.util.Scanner;

public class SumOfPerfectSquares {
    public static void main(String[] args) {
        int num = getANumberToSum();
        if (num > 1) {
            System.out.println(sumOfPerfectSquaresUpToToNum(num));
        }
    }


    public static int getANumberToSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        while (num < 1) {
            System.out.println("Error: Invalid input. Please enter a number greater than or equal to 1.");
            num = sc.nextInt();
        }
        return num;
    }

    public static int sumOfPerfectSquaresUpToToNum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i * i;
            System.out.println(i * i);
        }
        return sum;
    }

}

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 50;

        PrimeLister naive = new NaivePrimeLister();
        PrimeLister sqrt = new SqrtPrimeLister();
        PrimeLister sieve = new SievePrimeLister();

        System.out.println("Naive:");
        printPrimes(naive.generatePrimesUpTo(n));

        System.out.println("\nSqrt:");
        printPrimes(sqrt.generatePrimesUpTo(n));

        System.out.println("\nSieve:");
        printPrimes(sieve.generatePrimesUpTo(n));
    }

    private static void printPrimes(List<Integer> primes) {
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}

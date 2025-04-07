import java.util.Arrays;

public class MethodsPartTwo {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        String name = "Richard.";
        printName(name);
        System.out.println();
        System.out.println("Task 2.");
        printMessage();
        System.out.println();
        System.out.println("Task 3.");
        System.out.println("The 30% of the given number is: " + printThirtyPercent(100));
        System.out.println();
        System.out.println("Task 4.");
        String[] array1 = {"Oh ", "no"};
        System.out.println(writeEmptyString(array1));
        System.out.println();
        System.out.println("Task 5.");
        System.out.println(get42Point8Percent(100));
        System.out.println();
        System.out.println("Task 6.");
        System.out.println("The doubled length value of the given sentence is: " + writeDoubleLength("I will, but not today."));
        System.out.println();
        System.out.println("Task 7.");
        System.out.println("The difference between the numbers is" + writeDifference(11, 11));
        System.out.println("The difference between the numbers is" + writeDifference(11, 10));
        System.out.println("The difference between the numbers is" + writeDifference(10, 11));
        System.out.println();
        System.out.println("Task 8.");
        System.out.println("The square rooted length of the given sentence is: " + returnSquareRoot("I will, but not today."));
        System.out.println();
        System.out.println("Task 9.");
        System.out.println("The factorial length of the given sentence is: " + returnFactorialLength("I will, but not today."));
        System.out.println();
        System.out.println("Task 10.");
        System.out.println("If i divide with 1, we will get: " + printDividedValueBy100(1));
        System.out.println();
        System.out.println("Task 11.");
        System.out.println("This is a prime number, so it'll return the square of it: " + printWeirdPrime(11));
        System.out.println("This is not a prime but it's divisible by 4, so it'll return the double of the value: " + printWeirdPrime(12));
        System.out.println("This is not a prime and not divisible by 4, so it'll return the triple of the value: " + printWeirdPrime(9));
        System.out.println();
        System.out.println("Task 12.");
        array1 = new String[]{"clutch", "brake", "gas"};
        System.out.println("The length of these words are: " + Arrays.toString(printStringLengths(array1)));
        System.out.println();
        System.out.println("Task 13.");
        int averageSalary = 100000;
        System.out.println("The total salary you earned is:  " + calculateTotalSalary(averageSalary, calculatePersonalIncomeTax(averageSalary), calculateSocialSecurityTax(averageSalary)));
        System.out.println();
        System.out.println("Task 14.");
        boolean[] array2 = {true, true, true, false};
        boolean[] array3 = {false, false, false, true};
        System.out.println("The results of the XOR are: " + printXOR(array2) + " and " + printXOR(array3));
        System.out.println();
        System.out.println("Task 15.");
        int[] array4 = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println("The negative numbers of the array are: " + Arrays.toString(printNegativeNumbers(array4)));
    }

    //Task 1
    public static void printName(String name) {
        System.out.println("Hello, my name is: " + name);

    }

    //Task 2
    public static void printMessage() {
        System.out.println("Welcome to the program!");
    }

    //Task 3
    public static double printThirtyPercent(int num) {
        return num * 0.3;
    }

    //Task 4
    public static String writeEmptyString(String[] array1) {
        return " ";
    }

    //Task 5
    public static double get42Point8Percent(double num) {
        return num * 0.428;
    }

    //Task 6
    public static double writeDoubleLength(String str) {
        return str.length() * 2;
    }

    //Task 7
    public static int writeDifference(int num1, int num2) {
        return num2 - num1;
    }

    //Task 8
    public static double returnSquareRoot(String str) {
        int length = str.length();
        double sqrt = Math.sqrt(length);
        return sqrt;
    }

    //Task 9
    public static int returnFactorialLength(String str) {
        int length = str.length();
        int fact = 1;
        for (int i = length; i > 1; i--) {
            fact = factorialHelper(fact, i);
        }
        return fact;
    }

    private static int factorialHelper(int fact, int i) {
        int result = 1;
        for (int j = i; j > 0; j--) {
            result = fact * j;
        }
        return result;
    }

    //Task 10
    public static int printDividedValueBy100(int num) {
        return 100 / num;
    }

    //Task 11
    public static int printWeirdPrime(int num) {
        if (primeNumberGenerator(num)) {
            return num * num;
        } else if (num % 4 == 0) {
            return num * 2;
        }
        return num * 3;
    }

    public static boolean primeNumberGenerator(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //Task 12
    public static int[] printStringLengths(String[] str) {
        int[] lengths = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            int length = str[i].length();
            lengths[i] = length;
        }
        return lengths;
    }

    //Task 13
    public static int calculatePersonalIncomeTax(int salary) {
        return (int) (salary * 0.15);
    }

    public static int calculateSocialSecurityTax(int salary) {
        return (int) (salary * 0.185);
    }

    public static int calculateTotalSalary(int salary, int personalTax, int socialTax) {
        return salary - (personalTax + socialTax);
    }

    //Task 14
    public static boolean printXOR(boolean[] a) {
        boolean result = a[0];
        for (int i = 1; i < a.length; i++) {
            result = result ^ a[i];
        }
        return result;
    }

    //Task 15
    public static int[] printNegativeNumbers(int[] numbers) {
        int[] negativeNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeNumbers[i] = numbers[i];
            }
        }
        return negativeNumbers;
    }
}
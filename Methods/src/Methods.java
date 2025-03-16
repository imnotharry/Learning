public class Methods {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        System.out.println();
        System.out.println(isGreaterThan50(49));
        System.out.println(isGreaterThan50(51));
        System.out.println();
        System.out.println("Task 2.");
        System.out.println();
        System.out.println(maxNumber(11, 12));
        System.out.println(maxNumber(15, 14));
        System.out.println();
        System.out.println("Task 3.");
        System.out.println();
        System.out.println(isGreaterOrEqual(21, 20));
        System.out.println(isGreaterOrEqual(30, 31));
        System.out.println(isGreaterOrEqual(25, 25));
        System.out.println();
        System.out.println("Task 4.");
        System.out.println();
        printUntilAHundred();
        System.out.println();
        System.out.println("Task 5.");
        System.out.println();
        printDivisibleByFive(20);
        System.out.println();
        System.out.println("Task 6.");
        System.out.println();
        System.out.println(isPrime(7));
        System.out.println(isPrime(4));
        System.out.println();
        System.out.println("Task 7.");
        System.out.println();
        System.out.println(isDivisibleBySecondNumber(4, 20));
        System.out.println(isDivisibleBySecondNumber(20, 4));
        System.out.println();
        System.out.println("Task 8.");
        System.out.println();
        System.out.println(isEqualToThird(3, 3, 6));
        System.out.println(isEqualToThird(3, 6, 3));
        System.out.println();
        System.out.println("Task 9.");
        System.out.println();
        printCubicNumbers(6);
        System.out.println();
        System.out.println("Task 10.");
        System.out.println();
        printUntilSixtyFour(64);
        System.out.println();
        System.out.println("Task 11.");
        System.out.println();
        System.out.println(canSumUp(100, 25, 75, 45, 55));
        System.out.println(canSumUp(99, 25, 75, 45, 55));
        System.out.println();
        System.out.println("Task 12.");
        System.out.println();
        System.out.println(repeatStrings("I don't know to be honest  ", 3));
        System.out.println();
        System.out.println("Task 13.");
        System.out.println();
        System.out.println(concatenateStrings("Longest", "method ", "ever. "));
        System.out.println();
        System.out.println("Task 14.");
        System.out.println(); // feladat
        System.out.println();
        System.out.println("Task 15.");
        System.out.println();
        System.out.println(); // feladat
        System.out.println();
        System.out.println("Task 16.");
        System.out.println();
        System.out.println(); // feladat
        System.out.println();
        System.out.println("Task 17.");
        System.out.println();
        System.out.println(); // feladat
    }

    //Task 1
    public static boolean isGreaterThan50(int number) {
        return number > 50;
    }

    //Task 2
    public static int maxNumber(int number1, int number2) {
        return Math.max(number1, number2);
    }

    //Task 3
    public static String isGreaterOrEqual(int number1, int number2) {
        if (number2 > number1) {
            return "The second number is the greatest.";
        } else if (number1 > number2) {
            return "The first number is the greatest.";
        } else {
            return "They are equal.";
        }
    }

    //Task 4
    public static void printUntilAHundred() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    //Task 5
    public static void printDivisibleByFive(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    //Task 6
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    //Task 7
    public static boolean isDivisibleBySecondNumber(int number, int divisor) {
        return number % divisor == 0 ;

    }

    //Task 8
    public static boolean isEqualToThird(int number1, int number2, int number3) {
        return number1+number2==number3;

    }

    //Task 9
    public static void printCubicNumbers(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println((int) Math.pow(number, i));
        }
    }

    //Task 10
    public static void printUntilSixtyFour(int number) {
        for (int i = 1; i <= number; i++) {
            int result = (int) Math.pow(i, 3);
            if (result <= number) {
                System.out.println(result);
            }
        }
    }

    //Task 11
    public static boolean canSumUp(int target, int... nums) {

        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (remaining == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Task 12
    public static String repeatStrings(String str, int n) {
        if (n < 1) {
            return "";
        } else {
            String result = "";

            for (int i = 0; i < n; i++) {
                result += str;
            }
            return result;
        }
    }

    //Task 13
    public static String concatenateStrings(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    //Task 14

}
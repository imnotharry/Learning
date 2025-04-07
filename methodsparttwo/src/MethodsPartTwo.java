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
        System.out.println(get428Percent(100));
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
        String nothing = " ";
        return nothing;
    }
    //Task 5
    public static double get428Percent(double num) {
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
    
}

import java.util.Arrays;

public class ArrayFun {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {25, 27, 14, 11};
        String[] array3 = {"apple", "Anna"};
        String[] array4 = {"I", "don't", "know"};
        int[] array5 = {10, 20, 30, 40};
        int[] array6 = {11, 11, 12, 12};
        String[][] array7 = {{"Hi,", "how",}, {"are", "you?"}};
        String[][] array8 = {{"I,", "don't", "want", "to"}, {"do", "stuff!"}};
        String[][] array9 = {{"Oh", "no"}, {"not", "again!"}};
        String[][] array10 = {{"want", "2", "buy", "code",}, {"want", "2", "sell", "stuff"}};
        String[][] array11 = {{"haha2"}, {"haha2"}};
        String[][] array12 = {{"he he"}, {"he he"}};
        String[][] array13 = {{"I", "don't", "know"}, {"what", "to", "do!"}};
        System.out.println("Task 1.");
        System.out.println("The average of the even numbers in the array is: " + calculateTheAverageOfEvenNumbers(array1));
        System.out.println();
        System.out.println("Task 2.");
        System.out.println("The value of odd numbers returned in a new array: " + Arrays.toString(calculateSquaredOddNumbers(array2)));
        System.out.println();
        System.out.println("Task 3.");
        System.out.println("The numbers of letter 'a' and 'A' are : " + countLetterAInArray(array3));
        System.out.println();
        System.out.println("Task 4.");
        System.out.println("The strings concatenated which are longer than 3 characters: " + concatLongWords(array4));
        System.out.println();
        System.out.println("Task 5");
        System.out.println("Are there any consecutive duplicates in the array? The answer is: " + hasConsecutiveDuplicates(array5));
        System.out.println("Are there any consecutive duplicates in the array? The answer is: " + hasConsecutiveDuplicates(array6));
        System.out.println();
        System.out.println("Task 6.");
        System.out.println("The counted strings (a,o,e,i,u) in the array are: " + countTheGivenLetters(array7));
        System.out.println();
        System.out.println("Task 7.");
        System.out.println("The sum of the longest string in the array is:  " + sumLongestStringLengths(array8));
        System.out.println();
        System.out.println("Task 8.");
        System.out.println("The words uppercased in this array like:  " + Arrays.toString(uppercaseAllString(array9)));
        System.out.println();
        System.out.println("Task 9.");
        System.out.println("Is the given array contains a number? The answer is:  " + Arrays.deepToString(isContainDigit(array10)));
        System.out.println("Is the given array contains a number? The answer is:  " + Arrays.deepToString(isContainDigit(array11)));
        System.out.println("Is the given array contains a number? The answer is:  " + Arrays.deepToString(isContainDigit(array12)));
        System.out.println();
        System.out.println("Task 10.");
        System.out.println("The average length of the array is:  " + calculateAverageStringLength(array13));

    }

    //Task 1
    public static double calculateTheAverageOfEvenNumbers(int[] array) {
        int sum = 0;
        int counter = 0;
        for (int i : array) {
            if (i % 2 == 0 && i != 0) {
                sum += i;
                counter++;
            }
        }
        return (double) sum / counter;
    }

    //Task 2
    public static int[] calculateSquaredOddNumbers(int[] array) {
        int[] resultArray = new int[countElementsInTheArray(array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (isOddNumber(array[i])) {
                resultArray[j] = (int) Math.pow(array[i], 2);
                j++;
            }
        }
        return resultArray;
    }

    public static int countElementsInTheArray(int[] array) {
        int counter = 0;
        for (int number : array) {
            if (isOddNumber(number)) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isOddNumber(int number) {
        return number % 2 == -1 || number % 2 == 1;
    }


    //Task 3
    public static int countLetterAInArray(String[] array) {
        int count = 0;
        for (String string : array) {
            if (string.startsWith("a") || string.startsWith("A")) {
                count++;
            }
        }
        return count;
    }


    //Task 4
    public static String concatLongWords(String[] array) {
        StringBuilder concatenatedString = new StringBuilder();
        for (String string : array) {
            if (string.length() > 3) {
                concatenatedString.append(string).append(" ");
            }
        }
        return concatenatedString.toString();
    }

    //Task 5
    public static boolean hasConsecutiveDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }

    //Task 6
    public static int countTheGivenLetters(String[][] array) {
        int letterCount = 0;
        for (String[] stringArray : array) {
            for (String string : stringArray) {
                for (char c : string.toCharArray()) {
                    if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u' || c == 'A' || c == 'O' || c == 'E' || c == 'I' || c == 'U') {
                        letterCount++;
                    }
                }
            }
        }
        return letterCount;
    }

    //Task 7
    public static int sumLongestStringLengths(String[][] array) {
        int maxLength = 0;
        int[] lengths = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            for (String string : array[j]) {
                if (string.length() > maxLength) {
                    maxLength = string.length();
                }
            }
            lengths[j] = maxLength;
        }
        int sumOfLongestStringLengths = 0;
        for (int length : lengths) {
            sumOfLongestStringLengths += length;
        }
        return sumOfLongestStringLengths;
    }

    //Task 8
    public static int calculate2DArraySize(String[][] array) {
        int counter = 0;
        for (String[] strings : array) {
            counter += strings.length;
        }
        return counter;
    }

    public static String[] uppercaseAllString(String[][] array) {
        String[] uppercaseStrings = new String[calculate2DArraySize(array)];
        int index = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                uppercaseStrings[index++] = string.toUpperCase();
            }
        }
        return uppercaseStrings;
    }

    //Task 9
    public static boolean[][] isContainDigit(String[][] array) {
        boolean[][] subArray = new boolean[array.length][];
        for (int i = 0; i < array.length; i++) {
            subArray[i] = new boolean[array[i].length];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    char letter = array[i][j].charAt(k);
                    if (Character.isDigit(letter)) {
                        subArray[i][j] = true;
                    }
                }
            }
        }
        return subArray;
    }

    //Task 10
    public static double calculateAverageStringLength(String[][] array) {
        int value = 0;
        int divider = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                divider++;
                value += string.length();
            }
        }
        return (double) value / divider;
    }
}

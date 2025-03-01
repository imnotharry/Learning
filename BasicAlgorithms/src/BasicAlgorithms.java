public class BasicAlgorithms {
    public static void main(String[] args) {
        int[] anArray = {73, 100, 105, 110, -40, -25, 30, 73, 45, 60, 75, 120, 125, 73};
        // Min & Max task
        System.out.println("↓↓↓ Min & Max task downward ↓↓↓");
        int largest = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > largest) {
                largest = anArray[i];
            }
        }
        System.out.println("The largest element in the array is: " + largest);
        System.out.println();
        int smallest = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < smallest) {
                smallest = anArray[i];
            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
        System.out.println();
        System.out.println("↓↓↓ Counting tasks downward ↓↓↓");
        System.out.println();
        //Counting tasks
        int counter = 0;
        for (int i = 0; i < anArray.length; i++) {
            int numbers = anArray[i];
            if (numbers > 100) {
                counter++;
                System.out.println(numbers + " " + "is Greater than 100.");
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter + " " + "element(s) which is/are greater than 100.");
        System.out.println();
        int counter1 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int numbers = anArray[i];
            if (-50 < numbers && numbers < 78) {
                counter1++;
                System.out.println("Numbers in the array between -50 and 78: " + numbers);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter1 + " " + "element(s) between -50 and 78.");
        System.out.println();
        int counter2 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int arrayElements = anArray[i];
            if (arrayElements % 2 == 0) {
                counter2++;
                System.out.println("This can be divided by 2: " + arrayElements);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter2 + " " + "element(s) which can be divided by 2.");
        System.out.println();
        int counter3 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int arrayElements = anArray[i];
            if (arrayElements % 3 != 0) {
                counter3++;
                System.out.println("This can't be divided by 3: " + arrayElements);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter3 + " " + "element(s) which can't be divided by 3.");
        System.out.println();
        int counter4 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int arrayElements = anArray[i];
            if (arrayElements == 73) {
                counter4++;
                System.out.println(arrayElements);
            }
        }
        System.out.println();
        System.out.println("Number 73 can be found" + " " + counter4 + " " + "time(s).");
        System.out.println();
        System.out.println("↓↓↓ Searching task downward ↓↓↓");
        System.out.println();
        // Searching task
        boolean isValid = false;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 100) {
                isValid = true;
                break;
            }
        }
        System.out.println();
        System.out.println("Can we find number 100 in the array? The statement is: " + isValid);
        System.out.println();
        boolean isGreaterThan100 = false;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > 100) {
                isGreaterThan100 = true;
                break;
            }
        }
        System.out.println();
        System.out.println("Can we find higher numbers than 100? The statement is: " + isGreaterThan100);
        System.out.println();
        boolean isTrue = false;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == 7) {
                System.out.println(i);
                isTrue = true;
                break;
            }
        }
        if (!isTrue) {
            System.out.println("-1");
        }
        System.out.println();
        System.out.println("Can we find number 7 here? If not, the answer will be -1. The statement is:  " + isTrue);
        System.out.println();
        System.out.println("↓↓↓ Sum/prod task downward ↓↓↓");
        System.out.println();
        //Sum/prod tasks
        int sumnumbers = 0;
        for (int i = 0; i < anArray.length; i++) {
            sumnumbers += anArray[i];
        }
        System.out.println(sumnumbers);
        System.out.println();
        System.out.println("The sum of all numbers in the array are: " + sumnumbers);
        System.out.println();
        int prodnumbers = Integer.MAX_VALUE;
        for (int i = 0; i < anArray.length; i++) {
            prodnumbers *= anArray[i];
        }
        System.out.println(prodnumbers);
        System.out.println();
        System.out.println("The prod of all numbers in the array are: " + prodnumbers);
        System.out.println();
        int interestingsums = 0;
        for (int i = 0; i < anArray.length; i++) {
            if ((i + 1) % 4 == 0) {
                interestingsums -= anArray[i];
            } else {
                interestingsums += anArray[i];
            }
        }
        System.out.println();
        System.out.println("This is an interesting sum that we'll see here. The result is: " + interestingsums);
    }
}
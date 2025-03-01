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
            int number = anArray[i];
            if (number > 100) {
                counter++;
                System.out.println(number + " " + "is Greater than 100.");
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter + " " + "element(s) which is/are greater than 100.");
        System.out.println();
        int counter1 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int number = anArray[i];
            if (-50 < number && number < 78) {
                counter1++;
                System.out.println("Numbers in the array between -50 and 78: " + number);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter1 + " " + "element(s) between -50 and 78.");
        System.out.println();
        int counter2 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int number = anArray[i];
            if (number % 2 == 0) {
                counter2++;
                System.out.println("This can be divided by 2: " + number);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter2 + " " + "element(s) which can be divided by 2.");
        System.out.println();
        int counter3 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int number = anArray[i];
            if (number % 3 != 0) {
                counter3++;
                System.out.println("This can't be divided by 3: " + number);
            }
        }
        System.out.println();
        System.out.println("So there is/are " + counter3 + " " + "element(s) which can't be divided by 3.");
        System.out.println();
        int counter4 = 0;
        for (int i = 0; i < anArray.length; i++) {
            int number = anArray[i];
            if (number == 73) {
                counter4++;
                System.out.println(number);
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
        int sumnumber = 0;
        for (int i = 0; i < anArray.length; i++) {
            sumnumber += anArray[i];
        }
        System.out.println(sumnumber);
        System.out.println();
        System.out.println("The sum of all numbers in the array are: " + sumnumber);
        System.out.println();
        int prodnumber = Integer.MAX_VALUE;
        for (int i = 0; i < anArray.length; i++) {
            prodnumber *= anArray[i];
        }
        System.out.println(prodnumber);
        System.out.println();
        System.out.println("The prod of all numbers in the array are: " + prodnumber);
        System.out.println();
        int interestingsum = 0;
        for (int i = 0; i < anArray.length; i++) {
            if ((i + 1) % 4 == 0) {
                interestingsum -= anArray[i];
            } else {
                interestingsum += anArray[i];
            }
        }
        System.out.println();
        System.out.println("This is an interesting sum that we'll see here. The result is: " + interestingsum);
    }
}
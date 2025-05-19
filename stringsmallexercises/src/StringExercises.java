public class StringExercises {
    public static void main(String[] args) {
        System.out.println("Task 1.");
        System.out.println(countOfB("bombardier,Benz,biscuit, Banana"));
        System.out.println();
        System.out.println("Task 2.");
        System.out.println(countHello("helloIhellodon'thelloknowhellobdak,dba,jdhello"));
    }

    //Task 1
    public static int countOfB(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'B') {
                count++;
            }
        }
        return count;
    }

    //Task 2
    public static int countHello(String string) {
        int count = 0;
        for (int i = 0, j = 5; i < string.length() && j <= string.length(); i++, j++) {
            if (string.substring(i, j).equals("hello")) {
                count++;
            }
        }
        return count;
    }
}
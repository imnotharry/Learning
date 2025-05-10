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
    public static int countHello(String str1) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'h') {
                StringBuilder string = new StringBuilder();
                int index = i + 4;
                for (int j = i; j <= index; j++) {
                    string.append(str1.charAt(j));
                }
                if (string.toString().equals("hello")) {
                    count++;
                }
            }
        }
        return count;
    }
}
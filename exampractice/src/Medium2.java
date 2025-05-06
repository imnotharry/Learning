public class Medium2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(calculateWeirdNumbers(array));
    }

    public static int calculateWeirdNumbers(int[] array) {
        int even = 0;
        int odd = 0;
        int result;
        for (int i = 0; i < array.length; i++) {
            if (odd % 2 == 0) {
                odd = array[i] * 2;
            }
            if (even % 2 != 0) {
                even += array[i];
            }
        }
        result = odd - even;
        return result;
    }
}

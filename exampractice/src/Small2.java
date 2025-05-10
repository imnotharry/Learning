public class Small2 {
    public static void main(String[] args) {
        int[] array = {3,-7,1};
        System.out.println(maxDifference(array));
    }

    public static double maxDifference(int[] array) {
        int min = array[0];
        int max = array[0];
        int value;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        value = max - min;
        return value;
    }
}

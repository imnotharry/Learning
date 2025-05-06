public class Medium1 {
    public static void main(String[] args) {
        boolean[][][][] array1 = {{{{true, true}, {true, true}, {true, true}, {true, true}}}};
        boolean[][][][] array2 = {{{{false, false}, {false, false}, {false, false}, {false, false}}}};
        boolean[][][][] array3 = {{{{true, false}, {false, true}, {false, false}, {true, true}}}};
        System.out.println(areAllValuesTrue(array1));
        System.out.println(areAllValuesTrue(array2));
        System.out.println(areAllValuesTrue(array3));
    }

    public static boolean areAllValuesTrue(boolean[][][][] array) {
        for (boolean[][][] array1 : array) {
            for (boolean[][] array2 : array1) {
                for (boolean[] array3 : array2) {
                    for (boolean array4 : array3) {
                        if (array4 == false) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
public class TipCalculator {
    public static void main(String[] args) {
        int[] anArray = new int[]{2000, 250, 300, 50, 250};
        System.out.println(calculateTip(new int[]{calculateTotalPrice(anArray)}, checkPercentRange(0)));
        System.out.println(calculateTip(new int[]{calculateTotalPrice(anArray)}, checkPercentRange(5)));
        System.out.println(calculateTip(new int[]{calculateTotalPrice(anArray)}, checkPercentRange(20)));
        System.out.println(calculateTip(new int[]{calculateTotalPrice(anArray)}, checkPercentRange(85)));
    }

    public static int checkPercentRange(int percent) {
        return percent <= 80 && percent >= 10 ? percent : -1;
    }

    public static int calculateTip(int[] numbers, int percent) {
        return percent == -1 ? -1 : (numbers[0] * percent) / 100;
    }

    public static int calculateTotalPrice(int[] array) {
        int spentMoney = 0;
        for (int number : array) {
            spentMoney += number;
        }
        return spentMoney;
    }
}
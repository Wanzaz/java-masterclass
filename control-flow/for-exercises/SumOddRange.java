public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number < 0 || (number % 2 == 0)) {
            return false;
        }

        return true;
    }

    public static int sumOdd(int start, int end) {

        if (end < start || end < 0 || start < 0) {
            return -1;
        }

        int sumOfOddRange = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfOddRange += i;
            }
        }

        return sumOfOddRange;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        
    }
}

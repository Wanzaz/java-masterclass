public class SumDigits {

    public static int sumDigits(int number) {

        if (number <= 0) {
            return -1;
        }

        String numberString = Integer.toString(number);

        int sum = 0;
        int index = 0;

        while (index < numberString.length()) {
            char character = numberString.charAt(index);
            sum += Integer.valueOf(String.valueOf(character));
            index++;
        }
        
        return sum;
    }

    public static int sumDigitsSolution(int number) {

        if (number <= 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Sum of " + number + " is "+ sumDigits(number));
    }

}

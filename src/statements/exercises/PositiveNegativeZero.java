public class PositiveNegativeZero {
    
    public static void checkNumber(int number) {
        String stringNumber = "zero";
        if (number > 0) {
            stringNumber = "positive";
        } else if (number < 0) {
            stringNumber = "negative";
        }

        System.out.println("The number is " + stringNumber);
    }

    public static void main(String[] args) {
        int number = 9;

        checkNumber(number);
    }
}

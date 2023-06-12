public class FirstLastDigitSum {

    public static int firstDigit(int n) {

        while (n >= 10) {
            n /= 10;
        }

        return n;
    }

    public static int lastDigit(int n) {
        return (n % 10);
    }

    public static int sum(int n) {
        if (n < 0) {
            return -1;
        }

        return firstDigit(n) + lastDigit(n);
    }


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstNumber = 0;
        int lastNumber = 0;
        int sum = 0;

        lastNumber = number % 10;
        number = number / 10;

        if (number == 0) {
            firstNumber = lastNumber;
        }


        while (number != 0) {
            firstNumber = number % 10;
            number = number / 10;
        }

       
        return (firstNumber + lastNumber);
    }


    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

        System.out.println("*********************");

        System.out.println(sum(252));
        System.out.println(sum(257));
        System.out.println(sum(0));
        System.out.println(sum(5));
        System.out.println(sum(-10));
    }
    
}

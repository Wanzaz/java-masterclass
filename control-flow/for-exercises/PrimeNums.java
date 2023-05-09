import java.util.Scanner;

public class PrimeNums {

    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        int dividers = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                dividers++;
            }
        }

        if (dividers == 0) {
            return true;
        }

        return false;
    }
    
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();

        if (isPrime(number)) {
            System.out.println("Number " + number + " is prime");
        } else {
            System.out.println("Number " + number + " is NOT prime");
        }
        
    }
}

import java.util.Scanner;

public class PrimeNums {

    public static boolean isPrime(int number) {

        if (number == 0 || number == 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void forLoopPrimeChecker() {

        int counter = 0;
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " number is PRIME");
                counter++;
                if (counter == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
            
        }
        
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

        forLoopPrimeChecker();
        
    }
}

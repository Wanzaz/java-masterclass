import java.util.*;  

public class NumberPalindrom {

    public static boolean isPalindrome(int number) {
        int digit;
        int temp = number;
        int reverse = 0;

        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }

        return reverse==temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrom");
        } else {
            System.out.println(number + " is NOT a palindrom");
        }
    }
    
}

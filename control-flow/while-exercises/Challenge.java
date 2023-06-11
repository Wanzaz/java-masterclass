public class Challenge {

    public static void main(String[] args) {

        int number = 4;
        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("***************************");

        int num = 4;
        int evenCount = 0;
        int oddCount = 0;

        while (num <= 20) {
            num++;

            if (!isEvenNumber(num)) {
                System.out.println("Odd number " + num);
                oddCount++;
                continue;
            }
            System.out.println("Even number " + num);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Number of even numbers: " + evenCount +
                           "\nNumber of odd numbers: " + oddCount);
    }


    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

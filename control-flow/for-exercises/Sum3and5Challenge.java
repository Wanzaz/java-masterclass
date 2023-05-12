public class Sum3and5Challenge {
    
    public static void returnWantedNumbers() {

        int numberSum = 0;
        int count = 0;
        for (int i = 0; count <= 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numberSum += i;
                count++;
                System.out.println(i + " can be divided by 3 and 5");
            }
        }

        System.out.println("The sum of the first 5 nums: " + numberSum);
        
    }

    public static void main(String[] args) {
        returnWantedNumbers();
    }
}

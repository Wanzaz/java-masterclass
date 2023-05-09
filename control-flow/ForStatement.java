public class ForStatement {

    public static void main(String[] args) {

       printCalculatedInterest(100);
    }

    public static double calculateInterest(double amount, double ineterestRate) {

        return (amount * (ineterestRate / 100));
    }

    public static void printCalculatedInterest(double amount) {

        for (double i = 7.5; i <= 10.0; i += 0.25) {
            if (interestAmount > 8.5) {
                break;
            }
            double interestAmount = calculateInterest(amount, i);
            System.out.println("$" + amount + " at " + i + "% interest = " + interestAmount);
        }
        
    }
}

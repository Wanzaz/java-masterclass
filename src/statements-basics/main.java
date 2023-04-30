public class FirstClass {
    // Access modifier - public
    
    public static void main(String[] args) {
        // Method is collection of statements, one or more, that perform an operation

        // Conditional Logic - if then
        boolean isAlien = false;
        if (!isAlien) { // isAlien == false
            System.out.println("It is not an alien!");
        }
        
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <= 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Ternary Operator
        // operand1 ? operand2 : operand3
        String makeOfCar = "Volkswagen";
        boolean isDomestic = (makeOfCar == "Volkswagen") ? false : true;
        isDomestic = (makeOfCar != "Volkswagen"); // the same

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        // Operators Challenge
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double result = 100.00d * (firstValue + secondValue);
        double remainder = result % 40.00d;
        boolean isZero = (remainder == 0) ? true : false; 
        System.out.println(isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

    } 
}

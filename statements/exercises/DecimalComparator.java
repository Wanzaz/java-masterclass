public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return Double.toString(number1).substring(0, 5).equals(Double.toString(number2).substring(0, 5));
    }

    // Also a solution
    // public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
    //    	if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }   
    // }


    public static void main(String[] args) {
       System.out.println(areEqualByThreeDecimalPlaces(1.7356, 1.7354)); 
         
    }
}

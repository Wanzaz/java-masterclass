public class EqualSumChecker {

    public static boolean hasEqualSum(int operand1, int operand2, int total) {
        return ((operand1 + operand2) == total);
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
        
    }
}

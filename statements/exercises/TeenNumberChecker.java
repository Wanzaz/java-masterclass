public class TeenNumberChecker {
    
    public static boolean hasTeen(int num1, int num2, int num3) {

        if (((num1 <= 19) && (num1 >= 13)) || ((num2 <= 19) && (num2 >= 13)) ||((num3 <= 19) && (num3 >= 13))) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int age) {
        
        if ((age <= 19) && (age >= 13)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isTeen(19));
    }
}

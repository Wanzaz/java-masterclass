public class MethodOverloading {

    public static double convertToCentimeters(int inches) {

        return inches * 2.54d;
    }

    public static double convertToCentimeters(int feets, int inches) {

        // return ((feets * 12d) + inches) * 2.54d;
        return convertToCentimeters((feets * 12) + inches);
    }

    public static void main(String[] args) {
        System.out.println("5ft, 8n = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
}

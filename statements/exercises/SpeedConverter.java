public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        
        return Math.round(kilometersPerHour / 1.609);
    }
    
    public static void printConversion(double kilometersPerHour) {
        
        long converted;
        if ((converted = toMilesPerHour(kilometersPerHour)) == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " 
                               + converted + " mi/h");
        }
    }

    public static void main(String[] args) {
        double kmph = 99.99;
        printConversion(kmph);
    }
}

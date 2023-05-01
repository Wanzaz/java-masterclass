public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years = (int) ((minutes / 60) / 24) / 365;
            int days = (int) ((minutes / 60) / 24) - (years * 365);

            System.out.println(minutes + " min = " + years 
                                + " y and " + days + " d");
        }

    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}

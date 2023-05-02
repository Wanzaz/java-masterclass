public class DayOfWeek {

    public static String DayOfWeek(int day) {

        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> { yield "Monday"; }
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void main(String[] args) {
        System.out.println(0 + " - " + DayOfWeek(0));
        System.out.println(1 + " - " + DayOfWeek(1));
        System.out.println(2 + " - " + DayOfWeek(2));
        System.out.println(3 + " - " + DayOfWeek(3));
        System.out.println(4 + " - " + DayOfWeek(4));
        System.out.println(5 + " - " + DayOfWeek(5));
        System.out.println(6 + " - " + DayOfWeek(6));
        System.out.println(7 + " - " + DayOfWeek(7));

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);


    }
}

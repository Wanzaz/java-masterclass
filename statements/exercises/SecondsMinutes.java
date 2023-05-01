public class SecondsMinutes {

    public static String timeFormat(int hours, int minutes, int seconds) {

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds 
                    + "), must be a positive integer value";
        }

        // 1. Solution
        // int hours = seconds / 3600;
        // int remainderFromHours = seconds - (hours * 3600);
        // int minutes = remainderFromHours / 60;
        // int remainderOfSeconds = remainderFromHours - (minutes * 60);
        // return timeFormat(hours, minutes, remainingSeconds);

        // 2. Solution
        // int minutes = seconds / 60;
        // int hours = minutes / 60;
        // int remainingMinutes = minutes % 60;
        // int remainingSeconds = seconds % 60;
        // return timeFormat(hours, minutes, remainingSeconds);

        return getDurationString(seconds / 60, seconds % 60);
        
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes(" + minutes 
                    + "), must be a positive integer value";
        }
        if (minutes <= 0 || seconds >= 59) {
            return "Invalid data for minutes(" + seconds 
                    + "), must be between 0 and 59";
        }

        // 1. Solution
        // int total = minutes * 60 + seconds;
        // int hours = total / 3600;
        // int remainderFromHours = total - (hours * 3600);
        // minutes = remainderFromHours / 60;
        // int remainderOfSeconds = remainderFromHours - (minutes * 60);

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        
        return timeFormat(hours, remainingMinutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(-3901));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }
}

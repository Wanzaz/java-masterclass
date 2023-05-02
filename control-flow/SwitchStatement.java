public class SwitchStatement {
    
    public static void main(String[] args) {

        // Valid Switch Value Types - byte, short, int, char, String, enum

        // Traditional Switch Statement
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);

            default:
                System.out.println("Was not 1 ,2, 3, 4, or 5");
                break;
        }


        // Enhanced Switch Statement
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 1");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }

        String month = "PRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
        
    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponce = month + " is bad";
                yield badResponce;
                // switch statement is being used as a switch expression a value
                // -> "1st";  ======  -> { yield "1st"; }
            }
        };
    }
}

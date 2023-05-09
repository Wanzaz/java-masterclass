public class NumOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }

        if (year % 4 == 0) {
            if (!(year % 100 == 0)) {
                return true;
            } else {
                if (year % 400 == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    // public static boolean isLeapYear(int year) {
    //     return switch (year) {
    //         case (year <= 1 || year >= 9999) -> false;
    //         case (year % 4 == 0) -> {
    //             if (!(year % 100 == 0)) {
    //                 yield true;
    //             } else {
    //                 if (year % 400 == 0) {
    //                     yield true;
    //                 }
    //             }
    //         }
    //         default -> {
    //             System.out.println("Error");
    //             yield false;
    //         }
    //     };
        
    // }
    
    public static int getDaysinMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        return switch (month) {
            case 1 -> 31;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                }
                yield 28;
            }
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;

                
            default -> -1;
        };
        
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysinMonth(1, 2020));
        System.out.println(getDaysinMonth(2, 2020));
        System.out.println(getDaysinMonth(2, 2018));
        System.out.println(getDaysinMonth(-1, 2020));
        System.out.println(getDaysinMonth(1, -2020));
        
    }
}

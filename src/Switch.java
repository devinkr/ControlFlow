public class Switch {
    public static void main(String[] args) {
        // if else statements
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        // With Switch
        // Can use with byte, short, int, char (Byte, Short, Integer, Character) String, and enum;
//        int switchValue = 3;
//        switch (switchValue) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            case 3, 4, 5 -> {
//                System.out.println("Was a 3, 4, or 5");
//                System.out.println("Actually it was a " + switchValue);
//            } // Enhanced switch has no fallthrough so doesn't require breaks.
//            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
//        }
//        // more code here.

        String month = "XYZ";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

       getNato('A');

       // Print day of week
        printDayOfWeek(7);
    }

    public static String getQuarter(String month) {

        //JDK 14 switch expression
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; // used in switch expression to return a value
            }
        };
    }

    public static void getNato(char letter) {
        switch(letter) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println(letter + " not found");
        }
    }

    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch( day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> { yield "Tuesday"; } // if code block need yield to return
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

}

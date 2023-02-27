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

        String word = getNato('Z');
        System.out.println(word);
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

    public static String getNato(char letter) {
        String word;
        switch(letter) {
            case 'A':
                word = "Alpha";
                break;
            case 'B':
                word = "Baker";
                break;
            case 'C':
                word = "Charlie";
                break;
            case 'D':
                word = "Dog";
                break;
            case 'E':
                word = "Easy";
                break;
            default: word = letter + " not found";
        }
        return word;
    }


}

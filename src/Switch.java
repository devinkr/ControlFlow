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
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
            } // if break is not here it will continue until a break or end of switch.
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");
        }
        // more code here.
    }


}

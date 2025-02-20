class S2Q2{
    public static void main(String[] args) {
        int day = 3; 

        switch (day) {
            case 1: // Monday
                System.out.println("Monday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 2: // Tuesday
                System.out.println("Tuesday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 3: // Wednesday
                System.out.println("Wednesday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 4: // Thursday
                System.out.println("Thursday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 5: // Friday
                System.out.println("Friday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 6: // Saturday
                System.out.println("Saturday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            case 7: // Sunday
                System.out.println("Sunday");
                switch (day) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("It is a weekday.");
                        break;
                    case 6:
                    case 7:
                        System.out.println("It is a weekend.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid day number.");
        }
    }
}
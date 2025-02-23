class S2Q5{
    public static void main(String[] args) {
        int grade1 = 45;
        int grade2 = 30;
        int grade3 = 59;
        int failedSubjects = 0;

        switch (grade1 > 40 ? 1 : 0) {
            case 0: 
                failedSubjects++;
                break;
            case 1: 
                break;
        }
        

        switch (grade2 > 40 ? 1 : 0) {
            case 0: 
                failedSubjects++;
                break;
            case 1: 
                break;
        }

        // Use switch for subject 3
        switch (grade3 > 40 ? 1 : 0) {
            case 0: 
                failedSubjects++;
                break;
            case 1:                 break;
        }
        
        switch (failedSubjects) {
            case 0:
                System.out.println("The student passes!");
                break;
            default:
                System.out.println("The student failed in " + failedSubjects + " subject(s).");
                break;
        }

    }
}

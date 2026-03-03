class SpringSeason {
    public static void main(String[] args) {
        // Check if arguments are passed from the command line
        if (args.length < 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        // Parse command line arguments to integers
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        boolean isSpring = false;

        // Check if the date falls between March 20 and June 20
        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }

        // Print the result based on the boolean flag
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
public class DayOfWeek {
    public static void main(String[] args) {
        // Ensure the user passes exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        // Parse command-line arguments: m (month), d (day), and y (year) 
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Calculate using Gregorian calendar formulas 
        int y0 = y - (14 - m) / 12; // 
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400; // 
        int m0 = m + 12 * ((14 - m) / 12) - 2; // 
        
        // Calculate the final day of the week 
        int d0 = (d + x + 31 * m0 / 12) % 7; 

        // Output print 0 for Sunday, 1 for Monday, etc. 
        System.out.println("Day of the week (0=Sun, 1=Mon, ..., 6=Sat): " + d0);
    }
}
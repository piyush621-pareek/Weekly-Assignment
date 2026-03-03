import java.util.Scanner;

/**
 * Program 6: Find the youngest and tallest among 3 friends.
 * Uses comparisons to find the smallest age and largest height.
 */
class FriendStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inputs for Amar [cite: 112]
        System.out.print("Enter Amar's age and height: ");
        int ageAmar = input.nextInt();
        double heightAmar = input.nextDouble();

        // Inputs for Akbar [cite: 112]
        System.out.print("Enter Akbar's age and height: ");
        int ageAkbar = input.nextInt();
        double heightAkbar = input.nextDouble();

        // Inputs for Anthony [cite: 112]
        System.out.print("Enter Anthony's age and height: ");
        int ageAnthony = input.nextInt();
        double heightAnthony = input.nextDouble();

        // Find the youngest (smallest age) [cite: 113]
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : 
                                (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Find the tallest (largest height) [cite: 114]
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : 
                               (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("Youngest Friend: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("Tallest Friend: " + tallestFriend + " (Height: " + tallestHeight + ")");

        input.close();
    }
}
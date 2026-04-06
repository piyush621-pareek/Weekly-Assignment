import java.util.Scanner;

public class AthleteRoundsCalculator {

    // Method to compute the number of rounds to complete a 5km run
    public static double computeRoundsFor5Km(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double targetDistanceMeters = 5000; // 5 km is 5000 meters
        
        // Rounds = distance / perimeter
        return targetDistanceMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        double requiredRounds = computeRoundsFor5Km(side1, side2, side3);

        System.out.println("The athlete must complete " + requiredRounds + " rounds to run 5 km.");
        
        scanner.close();
    }
}
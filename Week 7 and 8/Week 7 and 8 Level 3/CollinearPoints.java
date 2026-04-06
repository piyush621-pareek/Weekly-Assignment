import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean checkUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Using cross multiplication of slopes: (y2 - y1) / (x2 - x1) == (y3 - y2) / (x3 - x2)
        // This avoids ArithmeticException (division by zero) if x points are the same.
        double slopeDiff = ((y2 - y1) * (x3 - x2)) - ((y3 - y2) * (x2 - x1));
        return slopeDiff == 0;
    }

    // Method to check collinearity using the area of triangle formula
    public static boolean checkUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2))
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point A (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point B (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for Point C (x3 y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        boolean isCollinearSlope = checkUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean isCollinearArea = checkUsingArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\n--- Results ---");
        System.out.println("Collinear using Slope Method: " + isCollinearSlope);
        System.out.println("Collinear using Area Method: " + isCollinearArea);

        if (isCollinearSlope && isCollinearArea) {
            System.out.println("The three points lie on the exact same straight line!");
        } else {
            System.out.println("The three points form a triangle.");
        }
        
        scanner.close();
    }
}
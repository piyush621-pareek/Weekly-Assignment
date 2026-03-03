import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the three sides of the triangular park in meters
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // 5 km is equivalent to 5000 meters
        double targetDistance = 5000; 

        // Calculate the number of rounds (distance / perimeter)
        double rounds = targetDistance / perimeter;

        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
        
        input.close();
    }
}
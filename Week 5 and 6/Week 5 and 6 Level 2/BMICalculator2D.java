import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = input.nextInt();

        if (numPersons <= 0) {
            System.out.println("Invalid number of persons. Exiting.");
            System.exit(0);
        }

        // 2D Array: Rows = persons, Columns = 3 (0: weight, 1: height, 2: BMI)
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter data for Person " + (i + 1) + ":");
            
            System.out.print("Weight in kg: ");
            double weight = input.nextDouble();
            System.out.print("Height in meters: ");
            double height = input.nextDouble();

            // Validate inputs
            if (weight <= 0 || height <= 0) {
                System.out.println("Weight and height must be positive values. Please re-enter.");
                i--; // Decrement index
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            
            // Calculate BMI = kg / m^2
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Determine status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display Output
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s\n", "Person", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s\n", 
                (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        input.close();
    }
}
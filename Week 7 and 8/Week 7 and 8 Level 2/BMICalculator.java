import java.util.Scanner;

public class BMICalculator {
    
    // Using 3 for quick testing, change to 10 for full class size
    static final int NUM_PERSONS = 3;

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            // Formula: weight / (height * height)
            data[i][2] = weight / Math.pow(heightInMeters, 2); 
        }
    }

    // Method to get BMI Status
    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array: rows = persons, cols = [weight, height, BMI]
        double[][] personData = new double[NUM_PERSONS][3];

        for (int i = 0; i < NUM_PERSONS; i++) {
            System.out.println("Enter data for Person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        calculateBMI(personData);
        String[] statuses = getBMIStatus(personData);

        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < NUM_PERSONS; i++) {
            System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n", 
                personData[i][0], personData[i][1], personData[i][2], statuses[i]);
        }

        scanner.close();
    }
}
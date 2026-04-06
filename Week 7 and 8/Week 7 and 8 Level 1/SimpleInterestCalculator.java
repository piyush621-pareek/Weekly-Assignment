import java.util.Scanner;

public class SimpleInterestCalculator {

    // Method to calculate the simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double timePeriod = scanner.nextDouble();

        double simpleInterest = calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);

        // Displaying the output as requested
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " 
                           + principalAmount + ", Rate of Interest " + rateOfInterest 
                           + ", and Time " + timePeriod + ".");
                           
        scanner.close();
    }
}
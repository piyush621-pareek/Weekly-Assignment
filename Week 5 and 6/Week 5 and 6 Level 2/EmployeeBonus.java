import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployees = 10;
        
        // Define parallel arrays for employee data
        double[] oldSalary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double[] bonus = new double[numEmployees];
        
        // Variables for company totals
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Loop to take inputs and validate
        for (int i = 0; i < oldSalary.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            
            System.out.print("Salary: ");
            double sal = input.nextDouble();
            System.out.print("Years of Service: ");
            double years = input.nextDouble();

            // Validate inputs
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Salary must be > 0 and years >= 0. Please re-enter.");
                i--; // Decrement index to ask for this employee again
                continue;
            }

            oldSalary[i] = sal;
            yearsOfService[i] = years;

            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = oldSalary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = oldSalary[i] + bonus[i];

            // Add to totals
            totalOldSalary += oldSalary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display Totals
        System.out.println("\n--- Company Payout Summary ---");
        System.out.println("Total Old Salary Payout: $" + totalOldSalary);
        System.out.println("Total Bonus Payout: $" + totalBonus);
        System.out.println("Total New Salary Payout: $" + totalNewSalary);

        input.close();
    }
}
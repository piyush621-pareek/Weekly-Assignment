import java.util.Scanner;

/**
 * Program 14: Find the power of a number using a while loop.
 */
class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input for number and power [cite: 164]
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        System.out.print("Enter the power (exponent): ");
        int power = input.nextInt();

        // Create result variable with initial value of 1 [cite: 165]
        long result = 1;
        // Create a temp variable counter initialized to zero [cite: 166]
        int counter = 0;

        // Use while loop till counter matches power [cite: 166]
        while (counter < power) {
            // Multiply result by the number [cite: 167]
            result *= number;
            // Increment the counter [cite: 168]
            counter++;
        }

        // Print the result [cite: 169]
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        input.close();
    }
}
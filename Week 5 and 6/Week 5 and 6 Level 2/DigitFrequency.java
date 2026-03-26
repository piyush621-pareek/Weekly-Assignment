import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        long number = input.nextLong(); // Using long for larger numbers

        if (number < 0) {
            System.out.println("Invalid input. Exiting.");
            System.exit(0);
        }

        // Special case for 0
        if (number == 0) {
            System.out.println("Digit 0 occurs 1 times.");
            System.exit(0);
        }

        // Step 1: Find count of digits
        long temp = number;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Step 2: Store digits in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // Step 3: Find frequency using an array of size 10 (for digits 0-9)
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            int currentDigit = digits[i];
            frequency[currentDigit]++; // Increment the count at the index matching the digit
        }

        // Step 4: Display frequencies
        System.out.println("\nDigit Frequencies in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times.");
            }
        }

        input.close();
    }
}
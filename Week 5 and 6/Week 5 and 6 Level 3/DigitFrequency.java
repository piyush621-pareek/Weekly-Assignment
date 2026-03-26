import java.util.Scanner;

// Class to find the frequency of each digit in a given number
public class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // a. Take the input for a number
        System.out.print("Enter a positive number: ");
        long number = input.nextLong();

        // Validate the user input; if negative, state the error and exit
        if (number < 0) {
            System.err.println("Invalid input. Please enter a positive number.");
            System.exit(0);
        }

        // Handle the edge case where the number is exactly 0
        if (number == 0) {
            System.out.println("\nFrequency of digits:");
            System.out.println("Digit 0 : 1 time(s)");
            System.exit(0);
        }

        // b. Find the count of digits in the number
        int count = 0;
        long tempCountNum = number;
        while (tempCountNum > 0) {
            count++;
            tempCountNum /= 10;
        }

        // c. Find the digits in the number and save them in an array
        int[] digits = new int[count];
        long tempExtractNum = number;
        
        // Use Array length property while using for loop
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int)(tempExtractNum % 10);
            tempExtractNum /= 10;
        }

        // d. Find the frequency of each digit in the number.
        // Define a frequency array of size 10 (for digits 0 through 9)
        int[] frequency = new int[10];

        // Loop through the digits array, and increase the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // e. Display the frequency of each digit in the number
        System.out.println("\nFrequency of digits in " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            // Only print the digit if it actually appeared in the number
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i] + " time(s)");
            }
        }

        // Close the Scanner Object
        input.close();
    }
}
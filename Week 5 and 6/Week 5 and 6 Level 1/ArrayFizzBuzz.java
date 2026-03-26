import java.util.Scanner;

public class ArrayFizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int number = input.nextInt();
        
        // Validate input
        if (number < 0) {
            System.err.println("Error: Please enter a positive integer.");
            System.exit(0);
        }
        
        // Create a String array to save the results. Size is number + 1 to include 0.
        String[] fizzBuzzResults = new String[number + 1];
        
        // Loop from 0 to the number
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                fizzBuzzResults[i] = String.valueOf(i);
            } else if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }
        
        // Print the array results
        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            System.out.println("Position " + i + " = " + fizzBuzzResults[i]);
        }
        
        input.close();
    }
}
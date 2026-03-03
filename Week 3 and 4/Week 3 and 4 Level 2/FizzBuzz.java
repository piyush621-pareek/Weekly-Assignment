import java.util.Scanner;

/**
 * Program 4: FizzBuzz with Positive Integer Check
 * Checks if a number is positive, then loops from 1 to that number
 * printing "Fizz", "Buzz", or "FizzBuzz" based on divisibility.
 */
class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input and check for positive integer [cite: 108]
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if (number > 0) {
            // Loop from 1 to the entered number [cite: 106]
            for (int i = 1; i <= number; i++) {
                // Check for multiples of both 3 and 5 [cite: 106]
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Check for multiples of 3 [cite: 106]
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Check for multiples of 5 [cite: 106]
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                // Otherwise print the number [cite: 106]
                else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        input.close();
    }
}
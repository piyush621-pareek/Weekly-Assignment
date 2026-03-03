import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a positive integer to find its factorial: ");
        int number = input.nextInt();
        
        // Check for positive integer
        if (number > 0) {
            int factorial = 1;
            int current = 1;
            
            // Compute factorial using a while loop
            while (current <= number) {
                factorial *= current;
                current++;
            }
            
            // Print the factorial at the end
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a strictly positive integer.");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
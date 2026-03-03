import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        
        // Get an integer input and store it in the number variable [cite: 121]
        int number = input.nextInt(); 
        
        // Define sum variable, initialize it to zero and assign original Number [cite: 121]
        int originalNumber = number; 
        int sum = 0; 
        
        // Use the while loop till the originalNumber is not equal to zero 
        while (originalNumber != 0) {
            // Find each digit which is the reminder of the modulus operation 
            int digit = originalNumber % 10; 
            
            // Find the cube of the number and add it to the sum variable 
            sum += (digit * digit * digit); 
            
            // Find the quotient of the number using the division operation [cite: 124]
            originalNumber = originalNumber / 10; 
        }
        
        // Check if the number and the sum are the same [cite: 126]
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is Not an Armstrong Number.");
        }
        
        input.close();
    }
}
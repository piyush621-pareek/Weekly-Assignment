import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get user input and validate for Natural Number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.err.println("Error: Please enter a valid natural number (greater than 0).");
            System.exit(0);
        }
        
        // Create integer arrays for even and odd numbers
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        
        // Index variables for odd and even arrays
        int evenIndex = 0;
        int oddIndex = 0;
        
        // Iterate from 1 to the number and separate odd/even
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        
        // Print the even numbers array
        System.out.print("Even Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        
        // Print the odd numbers array
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
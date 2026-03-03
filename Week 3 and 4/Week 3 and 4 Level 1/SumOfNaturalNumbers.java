import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a natural number: ");
        int n = input.nextInt();
        
        // Check if it's a natural number
        if (n > 0) {
            // Computation 1: Using Formula
            int sumFormula = n * (n + 1) / 2;
            
            // Computation 2: Using While Loop
            int sumLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumLoop += counter;
                counter++;
            }
            
            // Display and compare results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumLoop);
            
            if (sumFormula == sumLoop) {
                System.out.println("Both computations match and are correct.");
            }
        } else {
            System.out.println("The number is not a natural number");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
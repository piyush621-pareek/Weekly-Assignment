import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        
        // Convert cm to total inches first
        double totalInches = heightCm / 2.54;
        
        // Extract feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        
        // Output the results
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        
        input.close();
    }
}
import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        // Create scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();
        
        // Perform Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        
        // Output the result
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + 
                           number1 + " and " + number2 + " is " + addition + ", " + subtraction + 
                           ", " + multiplication + ", and " + division);
                           
        input.close();
    }
}
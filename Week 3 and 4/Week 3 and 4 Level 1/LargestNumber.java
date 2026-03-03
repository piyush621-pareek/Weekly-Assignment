import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers: ");
        // Get 3 input values
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // Conditional block to check which number is the largest
        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Is the first number the largest? Yes (" + number1 + ")");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Is the second number the largest? Yes (" + number2 + ")");
        } else {
            System.out.println("Is the third number the largest? Yes (" + number3 + ")");
        }
        
        // Closing the Scanner Stream
        input.close();
    }
}
import java.util.Scanner;

public class NumberExtremesFinder {

    // Method to find both the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        
        // Returning an array where index 0 is smallest and index 1 is largest
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int[] extremes = findSmallestAndLargest(num1, num2, num3);

        System.out.println("The smallest number is: " + extremes[0]);
        System.out.println("The largest number is: " + extremes[1]);
        
        scanner.close();
    }
}
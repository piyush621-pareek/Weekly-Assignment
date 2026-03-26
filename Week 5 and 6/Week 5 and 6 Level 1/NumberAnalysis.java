import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define an integer array of 5 elements
        int[] numbers = new int[5];
        
        // Take user input for the array
        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        System.out.println("\n--- Number Analysis ---");
        // Loop through the array using the length property
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // If positive, check for even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                // If negative
                System.out.println(numbers[i] + " is Negative.");
            } else {
                // If zero
                System.out.println(numbers[i] + " is Zero.");
            }
        }
        
        // Compare the first and last elements of the array
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("\n--- First vs Last Element ---");
        if (firstElement == lastElement) {
            System.out.println("The first (" + firstElement + ") and last (" + lastElement + ") elements are equal.");
        } else if (firstElement > lastElement) {
            System.out.println("The first element (" + firstElement + ") is greater than the last element (" + lastElement + ").");
        } else {
            System.out.println("The first element (" + firstElement + ") is less than the last element (" + lastElement + ").");
        }
        
        input.close();
    }
}
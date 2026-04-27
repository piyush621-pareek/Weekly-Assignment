import java.util.Scanner;

public class CustomStringLength {

    // Method to find string length without using length() [cite: 67]
    public static int getCustomLength(String text) {
        int count = 0;
        try {
            // Infinite loop to count characters 
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception handled, return the counted length 
            return count; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single word: ");
        
        // Using next() as specified 
        String input = sc.next(); 

        int customLength = getCustomLength(input);
        int builtInLength = input.length(); // Call built-in method 

        System.out.println("\n--- Output ---");
        System.out.println("Custom Method Length : " + customLength);
        System.out.println("Built-in Method Length: " + builtInLength);
        
        sc.close();
    }
}
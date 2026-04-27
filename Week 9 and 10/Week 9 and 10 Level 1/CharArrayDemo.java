import java.util.Scanner;

public class CharArrayDemo {

    // User-defined method to return characters as an array [cite: 82]
    public static char[] getCharactersArray(String text) {
        char[] charArray = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    // Compare two char arrays [cite: 83]
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Take user input [cite: 81]
            System.out.print("Enter text to convert to char array: ");
            String text = sc.next();

            char[] customArray = getCharactersArray(text);
            char[] builtInArray = text.toCharArray();

            // Display and compare results [cite: 84]
            System.out.println("\n--- Results ---");
            System.out.print("Custom Array: [ ");
            for (char c : customArray) System.out.print(c + " ");
            System.out.println("]");

            System.out.println("Arrays match: " + compareCharArrays(customArray, builtInArray));
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
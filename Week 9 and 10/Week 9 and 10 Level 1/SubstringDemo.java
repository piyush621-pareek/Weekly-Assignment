import java.util.Scanner;

public class SubstringDemo {

    // User-defined method to create a substring using charAt() [cite: 76]
    public static String createCustomSubstring(String text, int start, int end) {
        // Exception handling for out-of-bounds inputs [cite: 8]
        if (start < 0 || end > text.length() || start > end) {
            throw new StringIndexOutOfBoundsException("Invalid start or end index.");
        }
        
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings [cite: 77]
    public static boolean compareStrings(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Take user input [cite: 75]
            System.out.print("Enter a text: ");
            String text = sc.next();
            System.out.print("Enter start index: ");
            int start = sc.nextInt();
            System.out.print("Enter end index: ");
            int end = sc.nextInt();

            // Execute custom and built-in methods [cite: 78]
            String customSub = createCustomSubstring(text, start, end);
            String builtInSub = text.substring(start, end);

            System.out.println("\n--- Results ---");
            System.out.println("Custom Substring: " + customSub);
            System.out.println("Built-in Substring: " + builtInSub);
            System.out.println("Do both match? " + compareStrings(customSub, builtInSub));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input provided.");
        } finally {
            sc.close();
        }
    }
}
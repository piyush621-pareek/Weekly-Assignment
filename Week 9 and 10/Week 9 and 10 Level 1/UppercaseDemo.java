import java.util.Scanner;

public class UppercaseDemo {

    // User-defined method to convert to uppercase using ASCII [cite: 136, 137]
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // ASCII 'a' is 97, 'A' is 65. Subtracting 32 converts it to upper [cite: 137]
                result += (char) (ch - 32);
            } else {
                // If it is already uppercase or a special character, leave it as is
                result += ch;
            }
        }
        return result;
    }

    // User-defined comparison [cite: 138]
    public static boolean compareStrings(String str1, String str2) {
        return str1 != null && str1.equals(str2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Take complete text using nextLine() [cite: 135]
            System.out.print("Enter text to convert to uppercase: ");
            String text = sc.nextLine();

            String customUpper = convertToUppercase(text);
            String builtInUpper = text.toUpperCase();

            // Display and compare results [cite: 139, 140]
            System.out.println("\n--- Results ---");
            System.out.println("Custom Uppercase: " + customUpper);
            System.out.println("Built-in toUpperCase(): " + builtInUpper);
            System.out.println("Do both match? " + compareStrings(customUpper, builtInUpper));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
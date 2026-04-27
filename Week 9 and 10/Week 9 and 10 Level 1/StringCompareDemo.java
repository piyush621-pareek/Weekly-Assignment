import java.util.Scanner;

public class StringCompareDemo {

    // User-defined method to compare two strings using charAt() [cite: 69]
    public static boolean compareStrings(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Take user input [cite: 68]
            System.out.print("Enter the first string: ");
            String s1 = sc.next();
            System.out.print("Enter the second string: ");
            String s2 = sc.next();

            // Check using custom method and built-in method [cite: 70]
            boolean customResult = compareStrings(s1, s2);
            boolean builtInResult = s1.equals(s2);

            System.out.println("\n--- Results ---");
            System.out.println("Custom Method Result: " + customResult);
            System.out.println("Built-in equals() Result: " + builtInResult);
            
            if (customResult == builtInResult) {
                System.out.println("Status: The results are the SAME.");
            } else {
                System.out.println("Status: The results DIFFER.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
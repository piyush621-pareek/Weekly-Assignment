import java.util.Scanner;

public class CustomStringTrimmer {

    // Method to return start and end point in an array [cite: 131]
    public static int[] getTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to trim leading spaces [cite: 130]
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        // Loop to trim trailing spaces [cite: 130]
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end}; // [cite: 131]
    }

    // Method to create a substring using charAt() 
    public static String getCustomSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i); // Using charAt() 
        }
        return result;
    }

    // Method to compare two strings [cite: 133]
    public static boolean compareStrings(String str1, String str2) {
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
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Getting the text after trimming [cite: 134]
        int[] indices = getTrimIndices(text);
        String customTrimmed = getCustomSubstring(text, indices[0], indices[1]);
        
        // Built-in trim method [cite: 135]
        String builtInTrimmed = text.trim(); 
        
        boolean isMatch = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\n--- Output ---");
        System.out.println("Custom Trimmed  : [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed: [" + builtInTrimmed + "]");
        System.out.println("Match Result    : " + isMatch);
        
        sc.close();
    }
}
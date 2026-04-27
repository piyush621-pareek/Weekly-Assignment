import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean checkAnagram(String text1, String text2) {
        // Step 1: Check if the lengths of the two texts are equal [cite: 174]
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create arrays to store the frequency of characters [cite: 175]
        // Assuming standard ASCII characters (256 possible values)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Find the frequency of characters in the two texts using a loop [cite: 176]
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }

        // Step 4: Compare the frequency of characters in the two texts 
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // If frequencies are not equal, return false 
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user inputs [cite: 178]
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine().toLowerCase().replaceAll("\\s", ""); 

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");

        // Call user-defined method and display result [cite: 178]
        boolean isAnagram = checkAnagram(text1, text2);

        if (isAnagram) {
            System.out.println("Result: The texts ARE anagrams!");
        } else {
            System.out.println("Result: The texts ARE NOT anagrams.");
        }
        
        sc.close();
    }
}
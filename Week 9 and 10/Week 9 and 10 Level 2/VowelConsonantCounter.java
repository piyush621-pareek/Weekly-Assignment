import java.util.Scanner;

public class VowelConsonantCounter {

    // Method to check character type [cite: 107]
    public static String checkCharacterType(char c) {
        // Convert to lowercase if it is an uppercase letter using ASCII 
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        
        // Check if character is a letter
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel"; // 
            } else {
                return "Consonant"; // 
            }
        }
        return "Not a Letter"; // 
    }

    // Method to find and return the count in an array 
    public static int[] getVowelConsonantCount(String text) {
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants}; // 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to analyze: ");
        String text = sc.nextLine();

        // Call user defined method [cite: 112]
        int[] counts = getVowelConsonantCount(text); 

        System.out.println("\n--- Output ---");
        System.out.println("Total Vowels     : " + counts[0]);
        System.out.println("Total Consonants : " + counts[1]);
        
        sc.close();
    }
}
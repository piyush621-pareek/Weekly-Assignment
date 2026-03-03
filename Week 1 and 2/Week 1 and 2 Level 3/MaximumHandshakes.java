import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes using the combination formula: (n * (n - 1)) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The number of possible handshakes is: " + maxHandshakes);
        
        input.close();
    }
}
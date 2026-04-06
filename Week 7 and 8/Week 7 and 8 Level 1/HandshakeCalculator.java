import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        int possibleHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of possible handshakes is: " + possibleHandshakes);
        
        scanner.close();
    }
}
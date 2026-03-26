import java.util.Scanner;

public class MatrixFlatten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        
        // Create the 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the elements of the 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Create a 1D array of size rows * columns
        int[] flatArray = new int[rows * columns];
        int flatIndex = 0;
        
        // Nested loop to copy elements from 2D to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                flatArray[flatIndex] = matrix[i][j];
                flatIndex++;
            }
        }
        
        // Display the copied 1D array
        System.out.println("\nCopied 1D Array:");
        for (int i = 0; i < flatArray.length; i++) {
            System.out.print(flatArray[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
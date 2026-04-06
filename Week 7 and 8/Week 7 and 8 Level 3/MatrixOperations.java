import java.util.Scanner;

public class MatrixOperations {

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB, int r1, int c1, int c2) {
        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for matrices: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Matrix Addition ---");
        int[][] added = addMatrices(matrixA, matrixB, rows, cols);
        printMatrix(added);

        System.out.println("\n--- Matrix Subtraction ---");
        int[][] subtracted = subtractMatrices(matrixA, matrixB, rows, cols);
        printMatrix(subtracted);

        System.out.println("\n--- Matrix Multiplication ---");
        // For simplicity in this prompt, assuming square/compatible matrices based on initial rows/cols
        if (rows == cols) {
            int[][] multiplied = multiplyMatrices(matrixA, matrixB, rows, cols, cols);
            printMatrix(multiplied);
        } else {
            System.out.println("Multiplication requires columns of A to match rows of B. Please enter square dimensions for this test.");
        }

        scanner.close();
    }
}
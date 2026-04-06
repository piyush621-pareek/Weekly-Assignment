import java.util.Scanner;

public class QuadraticRoots {

    // Method to calculate roots
    public static double[] findRoots(double a, double b, double c) {
        // Corrected formula for delta (discriminant)
        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots (negative delta)
            return new double[0]; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratic Equation Solver (ax^2 + bx + c = 0)");
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Edge case: if 'a' is 0, it's not a quadratic equation
        if (a == 0) {
            System.out.println("If 'a' is 0, the equation is not quadratic.");
            scanner.close();
            return;
        }

        double[] roots = findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.printf("The equation has two roots: %.2f and %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root: %.2f\n", roots[0]);
        } else {
            System.out.println("The equation has no real roots (delta is negative).");
        }

        scanner.close();
    }
}
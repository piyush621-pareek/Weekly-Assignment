import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();
        
        // Calculate area in square centimeters
        double areaInSqCm = 0.5 * base * height;
        
        // Convert to square inches (1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm)
        double conversionFactor = 2.54 * 2.54;
        double areaInSqInches = areaInSqCm / conversionFactor;
        
        // Output the result
        System.out.println("The Area of the triangle in sq in is " + areaInSqInches + 
                           " and sq cm is " + areaInSqCm);
                           
        input.close();
    }
}
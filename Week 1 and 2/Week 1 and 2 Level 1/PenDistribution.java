class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        
        // Calculate quantity per student and the remainder
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        
        // Output the results
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
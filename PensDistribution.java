public class PensDistribution {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;
        
        // Number of students
        int numberOfStudents = 3;
        
        // Calculate number of pens each student will get
        int pensPerStudent = totalPens / numberOfStudents;
        
        // Calculate remaining non-distributed pens
        int remainingPens = totalPens % numberOfStudents;
        
        // Print results
        System.out.println("Each student will get " + pensPerStudent + " pens.");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}

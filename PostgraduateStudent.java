public class PostgraduateStudent extends Student {
    // Instance variable for postgraduate student
    private String thesisTitle;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        displayStudentDetails();
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable (shared among all courses)
    private static String instituteName = "Vedic Knowledge Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display the details of a course
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to modify the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Setter for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getter for fee
    public double getFee() {
        return fee;
    }

    // Setter for fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    // Getter for instituteName
    public static String getInstituteName() {
        return instituteName;
    }
}

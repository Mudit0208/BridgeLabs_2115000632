public class Main_Course {
    public static void main(String[] args) {
        // Create Course objects
        Course course1 = new Course("Bhagavad Gita Studies", 12, 199.99);
        Course course2 = new Course("Vedic Mathematics", 8, 149.99);
        Course course3 = new Course("Yoga and Meditation", 6, 99.99);

        // Display details of each course
        System.out.println("=== Course 1 ===");
        course1.displayCourseDetails();
        System.out.println("\n=== Course 2 ===");
        course2.displayCourseDetails();
        System.out.println("\n=== Course 3 ===");
        course3.displayCourseDetails();

        // Update the institute name for all courses
        Course.updateInstituteName("Ancient Wisdom Academy");

        // Display details again to see changes in institute name
        System.out.println("\n=== Updated Institute Name ===");
        System.out.println("=== Course 1 ===");
        course1.displayCourseDetails();
        System.out.println("\n=== Course 2 ===");
        course2.displayCourseDetails();
        System.out.println("\n=== Course 3 ===");
        course3.displayCourseDetails();
    }
}

import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter ages of the three friends
        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        // Prompt user to enter heights of the three friends
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = scanner.nextDouble();
        // Determine the youngest friend
        String youngestFriend;
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            youngestFriend = "Amar";
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }
        // Determine the tallest friend
        String tallestFriend;
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            tallestFriend = "Amar";
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }
        // Display the results
        System.out.println("The youngest friend is " + youngestFriend);
        System.out.println("The tallest friend is " + tallestFriend);
        scanner.close();
    }
}

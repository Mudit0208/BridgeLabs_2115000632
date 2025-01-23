import java.util.Scanner;

public class RocketLaunchCountdown2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the starting value for the countdown
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Liftoff!");

        scanner.close();
    }
}


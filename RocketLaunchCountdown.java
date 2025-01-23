import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the starting value for the countdown
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Liftoff!");

        scanner.close();
    }
}

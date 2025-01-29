import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature to convert: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the scale to convert from (F for Fahrenheit, C for Celsius): ");
        char scale = scanner.next().toUpperCase().charAt(0);

        if (scale == 'F') {
            // Convert Fahrenheit to Celsius
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is " + celsius + " Celsius.");
        } else if (scale == 'C') {
            // Convert Celsius to Fahrenheit
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Invalid scale entered. Please enter 'F' for Fahrenheit or 'C' for Celsius.");
        }

        scanner.close();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

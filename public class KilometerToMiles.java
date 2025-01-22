public class KilometerToMiles {
    public static void main(String[] args) {
        // Distance in kilometers
        double distanceInKilometers = 10.8; // you can change this value to any distance in kilometers

        // Conversion factor (1 mile = 1.6 kilometers)
        double conversionFactor = 1.6;

        // Calculate the distance in miles
        double distanceInMiles = distanceInKilometers / conversionFactor;

        // Print the result
        System.out.println("The distance " + distanceInKilometers + " km in miles is " + distanceInMiles);
    }
}

public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6371.0;
        
        // Convert radius to miles
        double radiusMiles = radiusKm / 1.6;
        
        // Calculate volume using the formula V = (4/3) * pi * r^3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // Print the results
        System.out.println("The volume of the Earth is approximately " + volumeKm3 + " km³.");
        System.out.println("The volume of the Earth is approximately " + volumeMiles3 + " miles³.");
    }
}

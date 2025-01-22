public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Original fee of the course
        double originalFee = 125000.0;
        
        // Discount percentage
        double discountPercentage = 10.0;
        
        // Calculate the discounted amount
        double discountAmount = originalFee * (discountPercentage / 100);
        
        // Calculate the final price after the discount
        double discountedPrice = originalFee - discountAmount;
        
        // Print the results
        System.out.println("The discounted amount is: INR " + discountAmount);
        System.out.println("The discounted price the student will pay is: INR " + discountedPrice);
    }
}

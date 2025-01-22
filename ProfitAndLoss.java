public class ProfitAndLoss {
    public static void main(String[] args) {
        // Define the cost price
        double costPrice = 129.0;
        
        // Define the selling price
        double sellingPrice = 191.0;

        // Calculate profit or loss
        double profitOrLoss = sellingPrice - costPrice;

        // Calculate profit or loss percentage
        double profitOrLossPercentage = (profitOrLoss / costPrice) * 100;

        // Determine and print if it's a profit or loss
        if (profitOrLoss > 0) {
            // If there's a profit
            System.out.println("Profit: INR " + profitOrLoss);
            System.out.println("Profit Percentage: " + profitOrLossPercentage + "%");
        } else if (profitOrLoss < 0) {
            // If there's a loss
            System.out.println("Loss: INR " + (-profitOrLoss));
            System.out.println("Loss Percentage: " + (-profitOrLossPercentage) + "%");
        } else {
            // If there's no profit or loss
            System.out.println("No Profit, No Loss");
        }
    }
}

public class SavingsAccount extends BankAccount {
    // Instance variable for interest rate
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

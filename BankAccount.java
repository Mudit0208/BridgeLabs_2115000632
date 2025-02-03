public class BankAccount {
    // Static variable (shared among all accounts)
    private static String bankName = "Hindu National Bank";
    private static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber; // Using 'this' to resolve ambiguity
        this.accountHolderName = accountHolderName; // Using 'this' to resolve ambiguity
        this.balance = balance;
        totalAccounts++; // Increment the total number of accounts
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Balance: ₹" + balance);
        }
    }

    // Static method to display the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Static method to change bank name
    public static void setBankName(String newBankName) {
        bankName = newBankName;
    }

    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount("1234567890", "Arjun Sharma", 50000.0);
        BankAccount account2 = new BankAccount("0987654321", "Lakshmi Iyer", 75000.0);

        // Check if objects are instances of BankAccount class
        if (account1 instanceof BankAccount) {
            System.out.println("=== Account 1 ===");
            account1.displayAccountDetails();
        }

        if (account2 instanceof BankAccount) {
            System.out.println("\n=== Account 2 ===");
            account2.displayAccountDetails();
        }

        // Display the total number of accounts
        BankAccount.getTotalAccounts();
    }
}

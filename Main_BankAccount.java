public class Main_BankAccount {
    public static void main(String[] args) {
        // Create BankAccount objects
        BankAccount account1 = new BankAccount("1234567890", "Arjun Sharma", 50000.0);
        BankAccount account2 = new BankAccount("0987654321", "Lakshmi Iyer", 75000.0);

        // Display details of each account
        System.out.println("=== Bank Account 1 ===");
        account1.displayAccountDetails();
        System.out.println("\n=== Bank Account 2 ===");
        account2.displayAccountDetails();

        // Create SavingsAccount objects
        SavingsAccount savings1 = new SavingsAccount("1122334455", "Ravi Kumar", 60000.0, 4.5);
        SavingsAccount savings2 = new SavingsAccount("5544332211", "Gita Rao", 80000.0, 5.0);

        // Display details of each savings account
        System.out.println("\n=== Savings Account 1 ===");
        savings1.displaySavingsAccountDetails();
        System.out.println("\n=== Savings Account 2 ===");
        savings2.displaySavingsAccountDetails();
    }
}

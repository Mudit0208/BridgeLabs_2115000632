import java.util.ArrayList;
import java.util.List;

// Account Class (Khata)
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double viewBalance() {
        return balance;
    }

    public String deposit(double amount) {
        balance += amount;
        return "Deposited " + amount + ". New balance: " + balance;
    }

    public String withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return "Withdrew " + amount + ". New balance: " + balance;
        } else {
            return "Insufficient funds";
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

// Customer Class (Grahak)
class Customer {
    private String name;
    private List<Account> accounts;  // List to store customer accounts

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to open a new account
    public void openAccount(Bank bank, double initialDeposit) {
        Account newAccount = bank.openAccount(this, initialDeposit);
        accounts.add(newAccount);
    }

    // Method to view balance of all accounts
    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + " Balance: " + account.viewBalance());
        }
    }

    // Getter method for accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
}

// Bank Class (SwarnaBank)
class Bank {
    private String bankName;
    private List<Customer> customers;  // List to store all customers of the bank

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public Account openAccount(Customer customer, double initialDeposit) {
        int accountNumber = customers.size() + 1; // Simple account numbering logic
        Account newAccount = new Account(accountNumber, initialDeposit);
        System.out.println("Account opened for customer: " + customer.getName() + " with account number: " + accountNumber);
        return newAccount;
    }

    // Method to add customer to the bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method to link an account to a customer (this is for record keeping, just for demonstration)
    public void addCustomerAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account number " + account.getAccountNumber() + " linked to customer " + customer.getName());
    }
}

// Main class to demonstrate the bank and customer relationship
public class BankingSystem {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("SwarnaBank");

        // Create customers with Hindu names
        Customer customer1 = new Customer("Arjun");
        Customer customer2 = new Customer("Sita");

        // Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Customers opening accounts
        customer1.openAccount(bank, 500.0);
        customer2.openAccount(bank, 1000.0);

        // View balances for each customer
        customer1.viewBalance();
        customer2.viewBalance();

        // Perform transactions
        System.out.println(customer1.getName() + " " + customer1.getAccounts().get(0).deposit(200.0));
        System.out.println(customer2.getName() + " " + customer2.getAccounts().get(0).withdraw(300.0));

        // View updated balances
        customer1.viewBalance();
        customer2.viewBalance();
    }
}
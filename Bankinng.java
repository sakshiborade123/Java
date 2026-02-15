import java.util.Scanner;

abstract class BankAccount {
    private String CustomerName;
    private double Balance;
    private String AccountType;
    static int custId = 0;  // Counter for customers
    
    public BankAccount(String CustomerName, double initialBalance, String Account) {
        this.CustomerName = CustomerName;
        this.Balance = initialBalance;
        this.AccountType = Account;
        custId++;
    }

    abstract double withdraw(double amount);

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
}

class Saving extends BankAccount {

    public Saving(String CustomerName, double initialBalance, String Account) {
        super(CustomerName, initialBalance, Account);
    }

    @Override
    double withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient balance");
            return getBalance();  // Return current balance if insufficient
        } else {
            setBalance(getBalance() - amount);  // Update the balance after withdrawal
            return getBalance();
        }
    }
}

class CustomerInfo {
    private String name;
    private int age;
    private BankAccount account;

    public CustomerInfo(String name, int age, BankAccount account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Account Type: " + account.getClass().getSimpleName());
        System.out.println("Current Balance: " + account.getBalance());
    }
}

public class Bankinng {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine();  // Consume newline

        System.out.println("Enter account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        BankAccount account = null;
        
        // Creating the appropriate account based on user input
        if (accountType.equals("Savings")) {
            account = new Saving(name, initialBalance, accountType);
        }

        // Creating customer info object
        CustomerInfo customer = new CustomerInfo(name, age, account);

        // Display customer details
        customer.displayCustomerInfo();

        // Perform withdrawal operation
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        double newBalance = account.withdraw(amount);

        System.out.println("New Balance: " + newBalance);

        scanner.close();
    }
}

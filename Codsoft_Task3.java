import java.util.Scanner;

class UserBankAccount {
    private double balance;

    public UserBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
            return false;
        }
    }
}

public class ATM {
    private UserBankAccount userAccount;
    private Scanner scanner;

    public ATM(UserBankAccount userAccount) {
        this.userAccount = userAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performOption(int option) {
        switch (option) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    private void checkBalance() {
        System.out.println("Current Balance: $" + userAccount.getBalance());
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            userAccount.deposit(depositAmount);
            System.out.println("Deposit successful. Updated balance: $" + userAccount.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        if (userAccount.withdraw(withdrawalAmount)) {
            System.out.println("Withdrawal successful. Updated balance: $" + userAccount.getBalance());
        }
    }

    public static void main(String[] args) {
        // Initialize user's bank account with an initial balance
        UserBankAccount userAccount = new UserBankAccount(1000.0);

        // Create an ATM instance and connect it to the user's bank account
        ATM atm = new ATM(userAccount);

        // ATM menu loop
        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();
            atm.performOption(choice);
        }
    }

}

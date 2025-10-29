public class BankAccount {
    static int total_accounts;
    static double total_bank_balance;
    int account_number;
    String account_holder;
    double balance;

    // constructor
    BankAccount(int account_number, String account_holder, double balance) {
        if (balance < 500) {
            System.out.println("Initial deposit must be at least 500");
        } else {
            this.account_number = account_number;
            this.account_holder = account_holder;
            this.balance = balance;
            total_accounts++;
            total_bank_balance += balance;
        }
    }

    // setter and getter for account_number and account_holder
    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getAccount_holder() {
        return account_holder;
    }

    public void setAccount_holder(String account_holder) {
        this.account_holder = account_holder;
    }

    // transaction methods
    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("!!!Amount cannot be negative!!!");
        } else {
            this.balance += amount;
            total_bank_balance += amount;
            System.out.println("Deposited $" + amount + " successfully!");
            System.out.println("New balance: $" + this.balance);
        }
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("!!!Amount cannot be negative!!!");
        } else if (amount > this.balance) {
            System.out.println("!!!Insufficient Balance!!!");
        } else if (this.balance - amount < 500) {
            System.out.println("Remaining balance has to be more than 500.");
        } else {
            this.balance -= amount;
            total_bank_balance -= amount;
            System.out.println("Withdrawn $" + amount + " successfully!");
            System.out.println("New balance: $" + this.balance);
        }
    }

    static void bank_information() {
        System.out.println("Number of accounts: " + total_accounts);
        System.out.println("Total balance: $" + total_bank_balance);
    }

    void account_information() {
        System.out.println("Account number: " + this.account_number);
        System.out.println("Account holder: " + this.account_holder);
        System.out.println("Account balance: $" + this.balance);
        System.out.println();
    }
}

// Base class Account
class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Credit money to account
    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited " + amount + ". New balance: " + balance);
    }

    // Debit money from account
    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Debited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Get account balance
    public double getBalance() {
        return balance;
    }
}

// Updated SavingAccount with handling fee
class SavingAccount extends Account {
    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void credit(double amount) {
        // 0.1% handling fee
        double fee = amount * 0.001;
        double amountAfterFee = amount - fee;
        balance += amountAfterFee;
        System.out.println("Credited " + amount + " with a handling fee of " + fee + ". New balance: " + balance);
    }

    public void updatePassbook() {
        System.out.println("Passbook updated for account " + accountNumber);
    }
}


// Current account subclass
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    // Specific operation: Request cheque book
    public void requestChequeBook() {
        System.out.println("Cheque book requested for account " + accountNumber);
    }
}
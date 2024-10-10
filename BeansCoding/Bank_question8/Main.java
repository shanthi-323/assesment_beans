public class Main {
    public static void main(String[] args) {
        // Create accounts
        SavingAccount savingAcc = new SavingAccount("SA001", "John Doe", 1000);
        CurrentAccount currentAcc = new CurrentAccount("CA001", "Jane Doe", 5000);

        // Perform operations
        savingAcc.credit(500); // Will apply handling fee
        currentAcc.credit(1000);

        // Bank to calculate interest
        Account[] accounts = {savingAcc, currentAcc};
        Bank bank = new Bank(accounts);
        bank.calculateYearlyInterest(); // Apply 0.3% interest to both accounts
    }
}

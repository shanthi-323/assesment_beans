class Bank {
    private final Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    // Calculate and credit interest to all accounts
    public void calculateYearlyInterest() {
        double interestRate = 0.003; // 0.3%
        for (Account account : accounts) {
            double interest = account.getBalance() * interestRate;
            account.credit(interest);
            System.out.println("Interest of " + interest + " credited to account " + account.accountNumber);
        }
    }
}
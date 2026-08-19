
class Bank {

    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;

    public Bank(long accountNumber, String accountType, double balance, String bankName, int userId, String userName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.bankName = bankName;
        this.userId = userId;
        this.userName = userName;
    }

    void displayBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }

    void displayUserDetails() {
        System.out.println("User Id: " + userId + " User Name: " + userName);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: " + balance);
    }

    String createAccountSummary() {
        String accountSummary = "Bank Name: " + bankName + " User Name: " + userName + " Account Number: " + accountNumber + " Account Type: " + accountType + " Balance: " + balance;
        return accountSummary;
    }

    boolean hasMinimumBalance(double minimumBalance) {
        boolean result = false;
        if (balance >= minimumBalance) {
            result = true;
        }
        return result;
    }

    boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

    boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    double checkBalance() {
        return balance;
    }

}

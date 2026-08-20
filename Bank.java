
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

}


import java.util.Scanner;

class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of accounts you want: ");
        int numberOfAcounts = sc.nextInt();
        System.out.println("Enter your Bank Name");
        String bankName = sc.nextLine();
        System.out.println("Enter User Name:");
        String userName = sc.nextLine();
        System.out.println("Enter Account Type:");
        String accountType = sc.nextLine();
        System.out.println("Enter User Id");
        int userId = sc.nextInt();
        System.out.println("Enter Account Number:");
        long accountNumber = sc.nextLong();
        System.out.println("Balance:");
        double balance = sc.nextDouble();
        Bank b = new Bank(accountNumber, accountType, balance, bankName, userId, userName);
        b.displayBankDetails();
        b.displayUserDetails();
        b.displayAccountDetails();
        System.out.println(b.deposit(2000) ? "Credited" : "Failed");
        System.out.println("Balance after credit: " + b.checkBalance());
        System.out.println(b.withdraw(2000) ? "withdraw" : "Failed");
        System.out.println("Balance after withdraw: " + b.checkBalance());
        String summary = b.createAccountSummary();
        System.out.println("Account summary: " + summary);
        System.out.println("Enter minimum balance required:");
        double minimumBalance = sc.nextDouble();
        boolean res = b.hasMinimumBalance(minimumBalance);
        if (res) {
            System.out.println("Minimum Balance is maintained");
        } else {
            System.out.println("Minimum Balance is not maintained");
        }

    }
}

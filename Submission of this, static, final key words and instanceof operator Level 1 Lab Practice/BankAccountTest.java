public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Arjun", 1001, 5000);
        BankAccount acc2 = new BankAccount("Raj", 1002, 7000);

        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
} 